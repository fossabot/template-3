package cc.chordflower.template.basic.application.verticles

import cc.chordflower.template.basic.application.config.Configuration
import cc.chordflower.template.basic.application.security.AppAuthenticationProvider
import cc.chordflower.template.basic.application.utils.ContextObjects
import cc.chordflower.template.basic.application.utils.currentEnvPath
import io.vavr.control.Option
import io.vertx.core.AbstractVerticle
import io.vertx.core.Promise
import io.vertx.core.http.CookieSameSite
import io.vertx.core.http.HttpServer
import io.vertx.core.http.HttpServerOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.ext.healthchecks.HealthCheckHandler
import io.vertx.ext.healthchecks.Status
import io.vertx.ext.web.Router
import io.vertx.ext.web.handler.AuthenticationHandler
import io.vertx.ext.web.handler.BasicAuthHandler
import io.vertx.ext.web.handler.BodyHandler
import io.vertx.ext.web.handler.CSPHandler
import io.vertx.ext.web.handler.CSRFHandler
import io.vertx.ext.web.handler.CorsHandler
import io.vertx.ext.web.handler.ErrorHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.redis.RedisSessionStore
import io.vertx.micrometer.PrometheusScrapingHandler
import io.vertx.redis.client.Redis
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.math.BigInteger
import java.nio.file.Files
import java.nio.file.Paths
import java.util.concurrent.TimeUnit
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.inject.Named

@ApplicationScoped
@Named
class ManagementServerVertex : AbstractVerticle {

  private val logger : Logger = LoggerFactory.getLogger(MainServerVertex::class.java)

  private var server : HttpServer? = null

  @Inject
  constructor() : super() {
    logger.debug("Building the management vertex")
  }

  /**
   * Creates the management server.
   *
   * @param startPromise A promise which should be called when verticle start-up is complete.
   */
  override fun start(startPromise: Promise<Void>?) {
    this.logger.info("Starting the management server")
    val conf = Option.of( this.getVertx().orCreateContext.get<Configuration>(ContextObjects.CONFIGURATION.key) )
      .getOrElseThrow( ::IllegalArgumentException )

    val httpServerOptions = HttpServerOptions()
    if(conf.server.options.compressionLevel != BigInteger.ZERO) {
      httpServerOptions.compressionLevel = conf.server.options.compressionLevel.toInt()
      httpServerOptions.isCompressionSupported = true
    }
    httpServerOptions.isDecompressionSupported = true
    httpServerOptions.isHandle100ContinueAutomatically = true
    httpServerOptions.host = conf.management.address
    httpServerOptions.idleTimeout = conf.server.options.idleTimeout.toInt()
    httpServerOptions.idleTimeoutUnit = TimeUnit.MILLISECONDS
    httpServerOptions.isUseProxyProtocol = false
    httpServerOptions.maxChunkSize = conf.server.options.maxChunkSize.toInt()
    httpServerOptions.logActivity = true
    httpServerOptions.maxHeaderSize = conf.server.options.maxHeaderSize.toInt()
    httpServerOptions.maxInitialLineLength = conf.server.options.maxInitialLineLength.toInt()
    httpServerOptions.port = conf.management.port.toInt()
    if( conf.server.certificate.isNotEmpty() && conf.server.key.isNotEmpty() &&
        Files.exists(Paths.get(conf.server.certificate)) &&
        Files.exists(Paths.get(conf.server.key))) {
      httpServerOptions.isSsl = true
      httpServerOptions.pemKeyCertOptions = PemKeyCertOptions()
        .addCertPath(conf.server.certificate)
        .addKeyPath(conf.server.key)
    }
    httpServerOptions.isTcpFastOpen = true
    httpServerOptions.isTcpNoDelay = true
    this.logger.info("Server options set")

    val bodyHandler = BodyHandler
      .create()
      .setBodyLimit(conf.server.options.maxBodySize.toLong())
      .setHandleFileUploads(true)
      .setUploadsDirectory(Paths.get(currentEnvPath.systemDataPath.toString(), "uploads").toString())
    this.logger.debug("Created the body handler")

    val corsHandler = CorsHandler.create()
    this.logger.debug("Created the cors handler")

    val cspHandler = CSPHandler.create()
    this.logger.debug("Created the csp handler")

    val csrfHandler = CSRFHandler
      .create(this.vertx, "")
      .setCookieHttpOnly(true)
      .setCookieName(conf.server.options.csrfCookieName)
      .setHeaderName(conf.server.options.csrfHeaderName)
      .setTimeout(conf.server.options.csrfCookieTimeout.toLong())
    this.logger.debug("Created the csrf handler")

    val errorHandler = ErrorHandler.create(this.vertx)
    this.logger.debug("Created the error handler")

    val redisSessionStore = RedisSessionStore.create(this.vertx,
      Option.of(this.vertx.orCreateContext.get(ContextObjects.REDIS.key) as Redis).getOrElseThrow(::IllegalArgumentException))

    val sessionHandler = SessionHandler
      .create(redisSessionStore)
      .setCookieHttpOnlyFlag(true)
      .setCookieMaxAge(conf.server.session.maxAge.toLong())
      .setCookieSameSite(CookieSameSite.STRICT)
      .setCookieSecureFlag(true)
      .setSessionCookieName(conf.server.session.key)
      .setSessionTimeout(conf.server.session.maxAge.toLong())
    this.logger.debug("Created the session handler")

    val httpServer = vertx.createHttpServer(httpServerOptions)
    this.logger.info("Created the server")

    val authenticationHandler : AuthenticationHandler = BasicAuthHandler.create( AppAuthenticationProvider(conf) )
    this.logger.debug("Created the authentication handler")

    val healthCheckHandler = HealthCheckHandler.create(this.vertx)
    this.logger.debug("Created the health check handler")

    //Available at: http://${conf.management.address}:${conf.management.port}/health/main
    healthCheckHandler.register("main", { it.complete(Status.OK()) })

    val router = Router.router(this.vertx)
    router.route()
      .handler(corsHandler).handler(cspHandler).handler(csrfHandler).handler(errorHandler)
      .handler(sessionHandler).handler(bodyHandler).handler(authenticationHandler)
    this.logger.debug("Registered the global handlers")

    router.route("/metrics").handler(PrometheusScrapingHandler.create())
    router.route("/health").handler(healthCheckHandler)
    this.logger.debug("Registered the specific routes")

    httpServer.listen({
      if(it.succeeded()) {
        this.logger.info("Management server has started!")
        startPromise?.complete()
      } else {
        this.logger.error("Management server has had an error", it.cause())
        startPromise?.fail(it.cause())
      }
    })
  }

  /**
   * Stop the management verticle.
   *
   * This is called by Vert.x when the verticle instance is un-deployed. Don't call it yourself.
   *
   * @param stopPromise A promise which should be called when verticle clean-up is complete.
   */
  override fun stop(stopPromise: Promise<Void>?) {
    this.logger.info("Stopping the management server!")
    this.server?.close({
      if(it.succeeded()) {
        this.logger.debug("Stopped the management server")
        stopPromise?.complete()
      } else {
        this.logger.debug("Error stopping the management server")
        stopPromise?.fail(it.cause())
      }
    })
  }
}

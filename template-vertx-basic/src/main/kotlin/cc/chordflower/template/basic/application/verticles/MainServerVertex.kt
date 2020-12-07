package cc.chordflower.template.basic.application.verticles

import io.vertx.core.AbstractVerticle
import io.vertx.core.Promise
import io.vertx.core.http.CookieSameSite
import io.vertx.core.http.HttpServer
import io.vertx.core.http.HttpServerOptions
import io.vertx.ext.consul.ConsulClientOptions
import io.vertx.ext.web.handler.BodyHandler
import io.vertx.ext.web.handler.CSPHandler
import io.vertx.ext.web.handler.CSRFHandler
import io.vertx.ext.web.handler.CorsHandler
import io.vertx.ext.web.handler.ErrorHandler
import io.vertx.ext.web.handler.FaviconHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.handler.StaticHandler
import io.vertx.ext.web.handler.TimeoutHandler
import io.vertx.ext.web.sstore.redis.RedisSessionStore
import io.vertx.redis.client.Redis
import io.vertx.redis.client.RedisClientType
import io.vertx.redis.client.RedisOptions
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.concurrent.TimeUnit
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.inject.Named

@Suppress("unused")
@ApplicationScoped
@Named
class MainServerVertex : AbstractVerticle {

  private val logger : Logger = LoggerFactory.getLogger(MainServerVertex::class.java)

  private var server : HttpServer? = null

  @Inject
  constructor() : super() {
    logger.info("Building the main vertex!")
  }

  override fun start(startPromise: Promise<Void>?) {
    val config = HttpServerOptions()
    config
      .setCompressionSupported(true)
      .setCompressionLevel(4)
      .setDecompressionSupported(true)
      .setHandle100ContinueAutomatically(true)
      .setHost("")
      .setIdleTimeout(200)
      .setIdleTimeoutUnit(TimeUnit.MILLISECONDS)
      .setUseProxyProtocol(false)
      .setMaxChunkSize(200)
      .setLogActivity(true)
      .setMaxHeaderSize(200)
      .setMaxInitialLineLength(200)
      .setPort(8080)
      .setSsl(true)
      .setTcpFastOpen(true)
      .setTcpNoDelay(true)

    var bodyHandler = BodyHandler
      .create()
      .setBodyLimit(200)
      .setHandleFileUploads(true)
      .setUploadsDirectory("")

    var corsHandler = CorsHandler
      .create()

    var cspHandler = CSPHandler
      .create()

    var csrfHandler = CSRFHandler
      .create(this.vertx, "")
      .setCookieHttpOnly(true)
      .setCookieName("")
      .setHeaderName("")
      .setTimeout(200)

    var errorHandler = ErrorHandler
      .create(this.vertx)

    var faviconHandler = FaviconHandler
      .create(this.vertx, "", 200) //MAX_CACHE

    var staticHandler = StaticHandler
      .create()
      .setAllowRootFileSystemAccess(false)
      .setDirectoryListing(false)
      .setEnableRangeSupport(true)
      .setFilesReadOnly(true)
      .setIncludeHidden(false)
      .setIndexPage("")
      .setMaxAgeSeconds(200) //MAX_CACHE
      .setSendVaryHeader(true)
      .setWebRoot("")

    var timeoutHandler = TimeoutHandler
      .create(200) //MS

    var redisOptions = RedisOptions()
      .setConnectionString("") // redis://host:port/db-number
      .setPassword("")
      .setType(RedisClientType.STANDALONE)

    var redis = Redis.createClient(this.vertx, redisOptions)

    var redisSessionStore = RedisSessionStore
      .create(this.vertx, redis)

    var sessionHandler = SessionHandler
      .create(redisSessionStore)
      .setCookieHttpOnlyFlag(true)
      .setCookieMaxAge(200)
      .setCookieSameSite(CookieSameSite.STRICT)
      .setCookieSecureFlag(true)
      .setSessionCookieName("")
      .setSessionTimeout(200)

    var consulOptions = ConsulClientOptions()
      .setHost("")
      .setPort(8500)
      .setDc("")
      .setAclToken("")

    server = this.vertx.createHttpServer(config)
    server?.listen()
    startPromise?.complete()
  }

  override fun stop(stopPromise: Promise<Void>?) {
    stopPromise?.complete()
  }
}

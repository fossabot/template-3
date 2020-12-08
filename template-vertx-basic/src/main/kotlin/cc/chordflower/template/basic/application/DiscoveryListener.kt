package cc.chordflower.template.basic.application

import cc.chordflower.template.basic.application.config.Configuration
import cc.chordflower.template.basic.application.events.Event
import cc.chordflower.template.basic.application.utils.ContextObjects
import io.vavr.control.Option
import io.vertx.core.Vertx
import io.vertx.ext.consul.ConsulClient
import io.vertx.ext.consul.ConsulClientOptions
import io.vertx.ext.consul.ServiceOptions
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.slf4j.LoggerFactory
import java.util.concurrent.TimeUnit
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Named
class DiscoveryListener @Inject constructor(private val eventBus: EventBus, private val vertx: Vertx) {

  private val logger = LoggerFactory.getLogger(DiscoveryListener::class.java)

  private var consulClient: ConsulClient? = null

  internal var consulClientCreator : Function2<Vertx, ConsulClientOptions, ConsulClient> = ConsulClient::create

  @PostConstruct
  fun init() {
    this.eventBus.register(this)
  }

  @Suppress("UNUSED_PARAMETER")
  @Subscribe(threadMode = ThreadMode.POSTING)
  fun registerServer( event : Event.LoggerConfiguredEvent ) {
    val conf = Option.of(this.vertx.orCreateContext.get<Configuration>(ContextObjects.CONFIGURATION.key)).getOrElseThrow(::IllegalArgumentException)
    if(conf.discovery.enabled) {
      logger.info("Registering server in consul")
      val consulClientOptions = ConsulClientOptions()
      consulClientOptions.host = conf.discovery.host
      consulClientOptions.port = conf.discovery.port.toInt()
      consulClientOptions.timeout = TimeUnit.SECONDS.toMillis(1)
      consulClientOptions.aclToken = conf.discovery.aclToken
      if(conf.discovery.datacenter.isNotEmpty()) {
        consulClientOptions.dc = conf.discovery.datacenter
      }
      this.consulClient = this.consulClientCreator(this.vertx, consulClientOptions)
      var serviceOptions = ServiceOptions()
      serviceOptions.address = conf.server.address
      serviceOptions.id = mainServiceName
      serviceOptions.name = mainServiceName
      serviceOptions.port = conf.server.port.toInt()
      this.consulClient?.registerService(serviceOptions, {
        if(it.succeeded()) {
          logger.info("Sucessfully registered the main server in consul")
        } else {
          logger.error("Error registering the main server in consul", it.cause())
        }
      })
      serviceOptions = ServiceOptions()
      serviceOptions.address = conf.management.address
      serviceOptions.id = metricsServiceName
      serviceOptions.name = metricsServiceName
      serviceOptions.port = conf.management.port.toInt()
      this.consulClient?.registerService(serviceOptions, {
        if(it.succeeded()) {
          logger.info("Sucessfully registered the metrics server in consul")
        } else {
          logger.error("Error registering the metrics server in consul", it.cause())
        }
      })
      if(this.consulClient != null) {
        logger.info("Adding consul client to vertx context")
        this.vertx.orCreateContext.put(ContextObjects.CONSUL.key, this.consulClient as ConsulClient)
      }
    }
  }

  @PreDestroy
  fun destroy() {
    this.eventBus.unregister(this)
    this.consulClient?.deregisterService(mainServiceName, {
      if(it.succeeded()) {
        logger.info("Sucessfully deregistered the main server in consul")
      } else {
        logger.error("Error deregistering the main server in consul", it.cause())
      }
    })
    this.consulClient?.deregisterService(metricsServiceName, {
      if(it.succeeded()) {
        logger.info("Sucessfully deregistered the metrics server in consul")
      } else {
        logger.error("Error deregistering the metrics server in consul", it.cause())
      }
    })
  }

  private companion object {
    const val mainServiceName = "template"
    const val metricsServiceName = "templateMetrics"
  }

}

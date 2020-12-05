package cc.chordflower.template.basic.application

import cc.chordflower.template.basic.application.config.Configuration
import cc.chordflower.template.basic.application.events.Event
import io.vavr.control.Option
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
class DiscoveryListener @Inject constructor(private val eventBus: EventBus) {

  private val logger = LoggerFactory.getLogger(DiscoveryListener::class.java)

  private var consulClient : ConsulClient? = null

  @PostConstruct
  fun init() {
    this.eventBus.register(this)
  }

  @Subscribe(threadMode = ThreadMode.POSTING)
  fun registerServer( event : Event.LoggerConfiguredEvent ) {
    if( event.vertx != null ) {
      val conf = Option.of(event.vertx.orCreateContext.get<Configuration>("configuration")).getOrElseThrow(::IllegalArgumentException)
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
        this.consulClient = ConsulClient.create(event.vertx, consulClientOptions)
        var serviceOptions = ServiceOptions()
        serviceOptions.address = conf.server.address
        serviceOptions.id = "template"
        serviceOptions.name = "template"
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
        serviceOptions.id = "templateMetrics"
        serviceOptions.name = "templateMetrics"
        serviceOptions.port = conf.management.port.toInt()
        this.consulClient?.registerService(serviceOptions, {
          if(it.succeeded()) {
            logger.info("Sucessfully registered the metrics server in consul")
          } else {
            logger.error("Error registering the metrics server in consul", it.cause())
          }
        })
      }
    } else {
      logger.error("Vertx object not found!")
    }
  }

  @PreDestroy
  fun destroy() {
    this.eventBus.unregister(this)
    this.consulClient?.deregisterService("template", {
      if(it.succeeded()) {
        logger.info("Sucessfully deregistered the main server in consul")
      } else {
        logger.error("Error deregistering the main server in consul", it.cause())
      }
    })
    this.consulClient?.deregisterService("templateMetrics", {
      if(it.succeeded()) {
        logger.info("Sucessfully deregistered the metrics server in consul")
      } else {
        logger.error("Error deregistering the metrics server in consul", it.cause())
      }
    })
  }

}

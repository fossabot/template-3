package cc.chordflower.template.basic.application

import cc.chordflower.template.basic.application.config.Configuration
import cc.chordflower.template.basic.application.events.Event
import cc.chordflower.template.basic.application.utils.ContextObjects
import io.vavr.control.Option
import io.vertx.redis.client.Redis
import io.vertx.redis.client.RedisOptions
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Named
class RedisListener @Inject constructor(private val eventBus: EventBus) {

  private val logger : Logger = LoggerFactory.getLogger(RedisListener::class.java)

  @PostConstruct
  fun init() {
    logger.debug("Registing redis listener!")
    eventBus.register(this)
  }

  @Subscribe(threadMode = ThreadMode.POSTING)
  fun createRedisClient( event : Event.LoggerConfiguredEvent ) {
    if(event.vertx != null) {
      logger.info("Creating redis client...")
      val redisOptions = RedisOptions()
      val conf = Option.of(event.vertx.orCreateContext.get<Configuration>(ContextObjects.CONFIGURATION.key)).getOrElseThrow( ::IllegalArgumentException )
      redisOptions.addConnectionString("""redis://${conf.redis.host}:${conf.redis.port}/${conf.redis.database.toLong()}""")
      if(conf.redis.password.isNotEmpty()) {
        redisOptions.password = conf.redis.password
      }
      event.vertx.orCreateContext.put(ContextObjects.REDIS.key, Redis.createClient(event.vertx, redisOptions))
    } else {
      logger.error("Vertx object not found!")
    }
  }

  @PreDestroy
  fun destroy() {
    logger.debug("Unregistering redis listener!")
    eventBus.unregister(this)
  }

}

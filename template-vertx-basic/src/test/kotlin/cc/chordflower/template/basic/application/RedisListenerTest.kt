package cc.chordflower.template.basic.application

import cc.chordflower.template.basic.application.config.Configuration
import cc.chordflower.template.basic.application.events.Event
import cc.chordflower.template.basic.application.utils.ContextObjects
import com.winterbe.expekt.expect
import io.kotest.core.spec.style.DescribeSpec
import io.vertx.core.Future
import io.vertx.core.Vertx
import io.vertx.redis.client.Redis
import io.vertx.redis.client.RedisConnection
import io.vertx.redis.client.Request
import io.vertx.redis.client.Response
import org.greenrobot.eventbus.EventBus
import org.mockito.Mockito

class RedisListenerTest: DescribeSpec({
  describe("With a mail listener", {
    var redisListener : RedisListener
    context("Given a valid redis listener", {
      val vertx: Vertx = Vertx.vertx()
      val eventBus: EventBus = Mockito.mock(EventBus::class.java)
      val redis : Redis = object : Redis {
        override fun connect(): Future<RedisConnection>? { return null }
        override fun close() {}
        override fun send(command: Request?): Future<Response>? { return null }
        override fun batch(commands: MutableList<Request>?): Future<MutableList<Response>>? { return null }
      }
      val configuration = Configuration()
      redisListener = RedisListener(eventBus, vertx)
      redisListener.createRedisClient = { _, conf ->
        expect(conf.endpoint).to.be.equal("redis://127.0.0.1:6379/0")
        redis
      }
      it("should be able to initialize", {
        redisListener.init()
        Mockito.verify(eventBus, Mockito.times(1)).register(Mockito.any(RedisListener::class.java))
      })
      it("should be able to perform its listenning action", {
        vertx.orCreateContext.put(ContextObjects.CONFIGURATION.key, configuration)
        redisListener.addRedisClient(Event.LoggerConfiguredEvent())
        expect(vertx.orCreateContext.get(ContextObjects.REDIS.key) as Redis).to.be.not.`null`
      })
      it("should be able to deinitialize", {
        redisListener.destroy()
        Mockito.verify(eventBus, Mockito.times(1)).unregister(Mockito.any(RedisListener::class.java))
      })
    })
  })
})

package cc.chordflower.template.basic.application

import cc.chordflower.template.basic.application.config.Configuration
import cc.chordflower.template.basic.application.events.Event
import cc.chordflower.template.basic.application.utils.ContextObjects
import com.winterbe.expekt.expect
import io.kotest.core.spec.style.DescribeSpec
import io.vertx.core.Vertx
import io.vertx.ext.consul.ConsulClient
import io.vertx.ext.consul.ServiceOptions
import org.greenrobot.eventbus.EventBus
import org.mockito.Mockito

class DiscoveryListenerTest: DescribeSpec({
  describe("With a discovery listener", {
    var discoveryListener : DiscoveryListener
    context("Given a valid discovery listener, ", {
      val vertx: Vertx = Vertx.vertx()
      val eventBus: EventBus = Mockito.mock(EventBus::class.java)
      val consulClient: ConsulClient = Mockito.mock(ConsulClient::class.java)
      val configuration = Configuration()
      configuration.discovery.enabled = true
      discoveryListener = DiscoveryListener(eventBus, vertx)
      discoveryListener.consulClientCreator = { _, consulClientOptions ->
        expect(consulClientOptions.host).to.be.equal("127.0.0.1")
        expect(consulClientOptions.port).to.be.equal(8500)
        expect(consulClientOptions.aclToken).to.be.equal("anonymous")
        consulClient
      }
      it("should be able to initialize", {
        discoveryListener.init()
        Mockito.verify(eventBus, Mockito.times(1)).register(Mockito.any(DiscoveryListener::class.java))
      })
      it("should be able to perform its listenning action", {
        vertx.orCreateContext.put(ContextObjects.CONFIGURATION.key, configuration)
        discoveryListener.registerServer(Event.LoggerConfiguredEvent())
        Mockito.verify(consulClient, Mockito.times(2)).registerService(Mockito.any(ServiceOptions::class.java), Mockito.any())
        expect(vertx.orCreateContext.get(ContextObjects.CONSUL.key) as ConsulClient).to.be.not.`null`
      })
      it("should be able to deinitialize", {
        discoveryListener.destroy()
        Mockito.verify(consulClient, Mockito.times(2)).deregisterService(Mockito.anyString(), Mockito.any())
        Mockito.verify(eventBus, Mockito.times(1)).unregister(Mockito.any(DiscoveryListener::class.java))
      })
    })
    context("Given an inactive discovery listener, ", {
      val vertx: Vertx = Vertx.vertx()
      val eventBus: EventBus = Mockito.mock(EventBus::class.java)
      val consulClient: ConsulClient = Mockito.mock(ConsulClient::class.java)
      val configuration = Configuration()
      configuration.discovery.enabled = false
      discoveryListener = DiscoveryListener(eventBus, vertx)
      discoveryListener.consulClientCreator = { _, consulClientOptions ->
        expect(consulClientOptions.host).to.be.equal("127.0.0.1")
        expect(consulClientOptions.port).to.be.equal(8500)
        expect(consulClientOptions.aclToken).to.be.equal("anonymous")
        consulClient
      }
      it("should be able to initialize", {
        discoveryListener.init()
        Mockito.verify(eventBus, Mockito.times(1)).register(Mockito.any(DiscoveryListener::class.java))
      })
      it("should not perform its listenning action", {
        vertx.orCreateContext.put(ContextObjects.CONFIGURATION.key, configuration)
        discoveryListener.registerServer(Event.LoggerConfiguredEvent())
        Mockito.verify(consulClient, Mockito.never()).registerService(Mockito.any(ServiceOptions::class.java), Mockito.any())
        expect(vertx.orCreateContext.get(ContextObjects.CONSUL.key) as ConsulClient?).to.be.`null`
      })
      it("should be able to deinitialize", {
        discoveryListener.destroy()
        Mockito.verify(consulClient, Mockito.never()).deregisterService(Mockito.anyString(), Mockito.any())
        Mockito.verify(eventBus, Mockito.times(1)).unregister(Mockito.any(DiscoveryListener::class.java))
      })
    })
  })
})

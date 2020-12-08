package cc.chordflower.template.basic.application

import cc.chordflower.template.basic.application.config.Configuration
import cc.chordflower.template.basic.application.events.Event
import cc.chordflower.template.basic.application.utils.ContextObjects
import com.winterbe.expekt.expect
import io.kotest.core.spec.style.DescribeSpec
import io.vertx.core.Vertx
import io.vertx.ext.mail.MailClient
import io.vertx.ext.mail.StartTLSOptions
import org.greenrobot.eventbus.EventBus
import org.mockito.Mockito

class MailListenerTest: DescribeSpec({

  describe("With a mail listener", {
    var mailListener : MailListener
    context("Given a valid mail listener", {
      val vertx: Vertx = Vertx.vertx()
      val eventBus: EventBus = Mockito.mock(EventBus::class.java)
      val mailClient : MailClient = Mockito.mock( MailClient::class.java )
      val configuration = Configuration()
      mailListener = MailListener(eventBus, vertx)
      mailListener.mailClientCreator = { _, conf ->
        expect(conf.hostname).to.be.equal("127.0.0.1")
        expect(conf.port).to.be.equal(654)
        expect(conf.starttls).to.be.equal(StartTLSOptions.DISABLED)
        mailClient
      }
      it("should be able to initialize", {
        mailListener.init()
        Mockito.verify(eventBus, Mockito.times(1)).register(Mockito.any(MailListener::class.java))
      })
      it("should be able to perform its listenning action", {
        vertx.orCreateContext.put(ContextObjects.CONFIGURATION.key, configuration)
        mailListener.registerMailClient(Event.LoggerConfiguredEvent())
        expect(vertx.orCreateContext.get(ContextObjects.MAIL.key) as MailClient).to.be.not.`null`
      })
      it("should be able to deinitialize", {
        mailListener.destroy()
        Mockito.verify(eventBus, Mockito.times(1)).unregister(Mockito.any(MailListener::class.java))
      })
    })
  })

})

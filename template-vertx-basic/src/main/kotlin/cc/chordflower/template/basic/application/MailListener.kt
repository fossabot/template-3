package cc.chordflower.template.basic.application

import cc.chordflower.template.basic.application.config.Configuration
import cc.chordflower.template.basic.application.events.Event
import io.vavr.control.Option
import io.vertx.ext.mail.MailClient
import io.vertx.ext.mail.MailConfig
import io.vertx.ext.mail.StartTLSOptions
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.inject.Named

@ApplicationScoped
@Named
class MailListener @Inject constructor(private val eventBus: EventBus) {

  private val logger : Logger = LoggerFactory.getLogger(MailListener::class.java)

  @PostConstruct
  fun init() {
    this.eventBus.register(this)
  }

  @Subscribe(threadMode = ThreadMode.POSTING)
  fun registerMailClient( event : Event.LoggerConfiguredEvent) {
    if( event.vertx != null ) {
      logger.info("Creating mail client")
      val conf = Option.of(event.vertx.orCreateContext.get<Configuration>("configuration")).getOrElseThrow( ::IllegalArgumentException )
      val mailConfig = MailConfig()
      mailConfig.hostname = conf.mail.address
      mailConfig.port = conf.mail.port.toInt()
      mailConfig.starttls = if(conf.mail.secure) StartTLSOptions.DISABLED else StartTLSOptions.REQUIRED
      if(conf.mail.username.isNotEmpty()) {
        mailConfig.username = conf.mail.username
      }
      if(conf.mail.password.isNotEmpty()) {
        mailConfig.password = conf.mail.password
      }
      event.vertx.orCreateContext.put("mail", MailClient.create(event.vertx, mailConfig))
      logger.info("Mail client created")
    } else {
      logger.error("Vertx object not found!")
    }
  }

  @PreDestroy
  fun destroy() {
    this.eventBus.unregister(this)
  }

}

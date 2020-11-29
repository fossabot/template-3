package cc.chordflower.template.basic

import org.greenrobot.eventbus.EventBus
import org.jetbrains.annotations.NotNull
import javax.enterprise.inject.Produces
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Named
class TemplateModules {

  @Singleton
  @Produces
  @NotNull
  @Named("eventBus")
  fun createEventBus(): EventBus {
    return EventBus.builder()
      .logNoSubscriberMessages(false)
      .sendNoSubscriberEvent(false)
      .build()
  }

}

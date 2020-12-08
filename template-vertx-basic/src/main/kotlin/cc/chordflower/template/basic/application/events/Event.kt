package cc.chordflower.template.basic.application.events

import cc.chordflower.template.basic.application.config.Configuration
import io.vavr.collection.Array
import java.util.*

abstract class Event<T> protected constructor(val eventType: EventType, val data: T) {
  class BeforeStartEvent : Event<Unit>(EventType.BEFORE_START, Unit)
  class ParseArgumentsEvent(arg: Array<String>) : Event<Array<String>>(EventType.PARSE_ARGUMENTS, arg)
  class ConfigurationParsingEvent(configuration: Configuration) : Event<Configuration>(EventType.CONFIG_PARSER, configuration)
  class LoggerConfiguredEvent : Event<Unit>(EventType.LOGGING_CONFIURATION, Unit)

  override fun equals(other: Any?): Boolean {
    if(this === other) {
      return true
    }
    if(other !is Event<*>) {
      return false
    }
    return data == other.data && eventType == other.eventType
  }

  override fun hashCode(): Int {
    return Objects.hash(data, eventType)
  }

  override fun toString(): String {
    return String.format("{eventType=%s, data=%s}", eventType, data)
  }
}

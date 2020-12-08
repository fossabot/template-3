package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.util.*
import javax.validation.Validator

class Configuration : BaseConfiguration, ValidatedObject {
  constructor() : super()

  constructor(it: JsonObject?) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.discovery = DiscoveryConfiguration(it.getJsonObject("discovery", JsonObject()))
      this.loggly = LogglyConfiguration(it.getJsonObject("loggly", JsonObject()))
      this.mail = MailConfiguration(it.getJsonObject("mail", JsonObject()))
      this.management = ManagementConfiguration(it.getJsonObject("management", JsonObject()))
      this.redis = RedisConfiguration(it.getJsonObject("redis", JsonObject()))
      this.server = ServerConfiguration(it.getJsonObject("server", JsonObject()))
    }
  }

  /**
   * Checks if this object is valid.
   *
   * @param validator The validator to use.
   * @return True if it is, false otherwise.
   */
  override fun valid(validator: Validator): Boolean {
    return validator.validate(this).isNotEmpty()
  }
}

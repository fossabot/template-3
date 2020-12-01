package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseLogglyConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.util.*
import javax.validation.Validator

class LogglyConfiguration : BaseLogglyConfiguration, ValidatedObject {

  constructor( it : JsonObject? ) : super() {
    Objects.requireNonNull(it)
    if( it != null ) {
      this.enabled = it.getBoolean("enabled", this.enabled)
      this.token = it.getString("token", this.token)
    }
  }

  override fun valid(validator: Validator): Boolean {
    return validator.validate(this).isNotEmpty()
  }
}

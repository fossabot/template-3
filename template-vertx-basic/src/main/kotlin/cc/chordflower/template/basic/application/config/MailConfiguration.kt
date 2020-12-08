package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseMailConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.math.BigInteger
import java.util.*
import javax.validation.Validator

class MailConfiguration : BaseMailConfiguration, ValidatedObject {
  constructor() : super()

  constructor( it : JsonObject? ) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.address = it.getString("address", this.address)
      this.from = it.getString("from", this.from)
      this.password = it.getString("password", this.password)
      this.secure = it.getBoolean("secure", this.secure)
      this.port = BigInteger.valueOf(it.getLong("port", this.port.toLong()))
    }
  }

  override fun valid(validator: Validator): Boolean {
    return validator.validate(this).isNotEmpty()
  }
}

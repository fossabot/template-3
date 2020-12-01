package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseManagementConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.math.BigInteger
import java.util.*
import javax.validation.Validator

class ManagementConfiguration : BaseManagementConfiguration, ValidatedObject {

  constructor( it : JsonObject? ) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.address = it.getString("address", this.address)
      this.password = it.getString("password", this.password)
      this.port = BigInteger.valueOf(it.getLong("port", this.port.toLong()))
      this.username = it.getString("username", this.username)
    }
  }

  override fun valid(validator: Validator): Boolean {
    return validator.validate(this).isNotEmpty()
  }
}

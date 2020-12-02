package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseServerConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.math.BigInteger
import java.util.*
import javax.validation.Validator

class ServerConfiguration : BaseServerConfiguration, ValidatedObject {

  constructor( it : JsonObject? ) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.address = it.getString("address", this.address)
      this.certificate = it.getString("certificate", this.certificate)
      this.key = it.getString("key", this.key)
      this.options = OptionsConfiguration( it.getJsonObject("options", JsonObject()) )
      this.session = SessionConfiguration( it.getJsonObject("session", JsonObject()) )
      this.staticConf = StaticConfiguration( it.getJsonObject("static", JsonObject()) )
      this.port = BigInteger.valueOf(it.getLong("port", this.port.toLong()))
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

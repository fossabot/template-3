package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseSessionConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.math.BigInteger
import java.util.*
import javax.validation.Validator

/**
 * Represents a session configuration.
 */
@Suppress("unused")
class SessionConfiguration : BaseSessionConfiguration, ValidatedObject {

  /**
   * Creates a new session configuration from a json object.
   *
   * @param it The json object to use.
   */
  constructor(it: JsonObject?) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.key = it.getString("key", this.key)
      this.maxAge = BigInteger.valueOf(it.getLong("max_age", this.maxAge.toLong()))
    }
  }

  /**
   * Checks if this session configuration is valid.
   *
   * @param validator The validator to use.
   * @return True if it is, false otherwise.
   */
  override fun valid(validator: Validator): Boolean {
    return validator.validate(this).isNotEmpty()
  }
}

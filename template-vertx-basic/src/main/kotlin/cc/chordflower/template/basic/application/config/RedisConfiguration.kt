package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseRedisConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.math.BigInteger
import java.util.*
import javax.validation.Validator

/**
 * Represents a redis configuration.
 */
class RedisConfiguration : BaseRedisConfiguration, ValidatedObject {

  /**
   * Creates a new redis configuration given a json object.
   *
   * @param it The json object.
   */
  constructor(it: JsonObject?) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.database = BigInteger.valueOf(it.getLong("database", this.database.toLong()))
      this.host = it.getString("host", this.host)
      this.password = it.getString("password", this.password)
      this.port = BigInteger.valueOf(it.getLong("port", this.port.toLong()))
    }
  }

  /**
   * Checks if this redis configuration is valid.
   *
   * @param validator The validator to use.
   * @return True if it is, false otherwise.
   */
  override fun valid(validator: Validator): Boolean {
    return validator.validate(this).isNotEmpty()
  }
}

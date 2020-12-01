package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseStaticConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.math.BigInteger
import java.util.*
import javax.validation.Validator

/**
 * Represents a static configuration.
 */
@Suppress("unused")
class StaticConfiguration : BaseStaticConfiguration, ValidatedObject {

  /**
   * Creates a new static configuration, using a json object.
   *
   * @param it The json object to use for the construction.
   */
  constructor(it: JsonObject?) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.indexPage = it.getString("index_page", this.indexPage)
      this.maxCacheTime = BigInteger.valueOf(it.getLong("max_cache_time", this.maxCacheTime.toLong()))
    }
  }

  /**
   * Checks if this static configuration is valid.
   *
   * @param validator The validator to use for the validation
   * @return True if it is, false otherwise
   */
  override fun valid( validator : Validator ) : Boolean {
    return validator.validate(this).isNotEmpty()
  }
}

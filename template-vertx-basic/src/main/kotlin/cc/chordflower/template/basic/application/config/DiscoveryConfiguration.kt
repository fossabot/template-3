package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseDiscoveryConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.math.BigInteger
import java.util.*
import javax.validation.Validator

class DiscoveryConfiguration : BaseDiscoveryConfiguration, ValidatedObject {

  constructor( it : JsonObject? ) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.aclToken = it.getString("acl_token", this.aclToken)
      this.datacenter = it.getString("datacenter", this.datacenter)
      this.enabled = it.getBoolean("enabled", this.enabled)
      this.host = it.getString("host", this.host)
      this.port = BigInteger.valueOf(it.getLong("port", this.port.toLong()))
    }
  }

  /**
   * Checks if this discovery configuration is valid.
   *
   * @param validator The validator to use.
   * @return True if it is, false otherwise.
   */
  override fun valid(validator: Validator): Boolean {
    return validator.validate(this).isNotEmpty()
  }


}

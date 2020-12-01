package cc.chordflower.template.basic.application.config.base

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.io.Serializable
import java.math.BigInteger
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin

/**
 * Definitions related to the registration in a consul server
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("enabled", "host", "port", "datacenter", "acl_token")
open class BaseDiscoveryConfiguration : Serializable {

  /**
   * Enable the consul registration
   */
  @get:JsonProperty("enabled")
  @set:JsonProperty("enabled")
  @JsonProperty("enabled")
  @JsonPropertyDescription("Enable the consul registration")
  var enabled: Boolean
    protected set

  /**
   * The location of the consul server
   */
  @get:JsonProperty("host")
  @set:JsonProperty("host")
  @JsonProperty("host")
  @JsonPropertyDescription("The location of the consul server")
  var host: String
    protected set

  /**
   * The consul server port
   */
  @get:JsonProperty("port")
  @set:JsonProperty("port")
  @JsonProperty("port")
  @JsonPropertyDescription("The consul server port")
  @DecimalMin("1")
  @DecimalMax("65535")
  var port: BigInteger
    protected set

  /**
   * The datacenter to use
   */
  @get:JsonProperty("datacenter")
  @set:JsonProperty("datacenter")
  @JsonProperty("datacenter")
  @JsonPropertyDescription("The datacenter to use")
  var datacenter: String
    protected set

  /**
   * The acl token to use
   */
  @get:JsonProperty("acl_token")
  @set:JsonProperty("acl_token")
  @JsonProperty("acl_token")
  @JsonPropertyDescription("The acl token to use")
  var aclToken: String
    protected set

  internal constructor() {
    enabled = false
    host = "127.0.0.1"
    port = BigInteger("8500")
    datacenter = ""
    aclToken = "anonymous"
  }

  constructor(
    enabled: Boolean, host: String,
    port: @DecimalMin("1") @DecimalMax("65535") BigInteger,
    datacenter: String, aclToken: String
  ) {
    this.enabled = enabled
    this.host = host
    this.port = port
    this.datacenter = datacenter
    this.aclToken = aclToken
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseDiscoveryConfiguration

    if(enabled != other.enabled) return false
    if(host != other.host) return false
    if(port != other.port) return false
    if(datacenter != other.datacenter) return false
    if(aclToken != other.aclToken) return false

    return true
  }

  override fun hashCode(): Int {
    var result = enabled.hashCode()
    result = 31 * result + host.hashCode()
    result = 31 * result + port.hashCode()
    result = 31 * result + datacenter.hashCode()
    result = 31 * result + aclToken.hashCode()
    return result
  }

  override fun toString(): String {
    return "(enabled=$enabled, host='$host', port=$port, datacenter='$datacenter', aclToken='$aclToken')"
  }
}

package cc.chordflower.template.basic.application.config.base

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.io.Serializable
import java.math.BigInteger
import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin

/**
 * Server related properties
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("address", "port", "certificate", "key", "session", "options", "static")
open class BaseServerConfiguration : Serializable {

  /**
   * The address the server should listen to it must be an ip address
   */
  @get:JsonProperty("address")
  @set:JsonProperty("address")
  @field:JsonProperty("address")
  @field:JsonPropertyDescription("The address the server should listen to it must be an ip address")
  var address: String
    protected set

  /**
   * The port the server should listen to
   */
  @get:JsonProperty("port")
  @set:JsonProperty("port")
  @field:JsonProperty("port")
  @field:JsonPropertyDescription("The port the server should listen to")
  @field:DecimalMin("0")
  @field:DecimalMax("65535")
  var port: BigInteger
    protected set

  /**
   * The certificate (public key) to use by the server (activates tls)
   */
  @get:JsonProperty("certificate")
  @set:JsonProperty("certificate")
  @field:JsonProperty("certificate")
  @field:JsonPropertyDescription("The certificate (public key) to use by the server (activates tls)")
  var certificate: String
    protected set

  /**
   * The private key to use by the server
   */
  @get:JsonProperty("key")
  @set:JsonProperty("key")
  @field:JsonProperty("key")
  @field:JsonPropertyDescription("The private key to use by the server")
  var key: String
    protected set

  /**
   * Configuration related to the session
   */
  @get:JsonProperty("session")
  @set:JsonProperty("session")
  @field:JsonProperty("session")
  @field:JsonPropertyDescription("Configuration related to the session")
  @field:Valid
  var session: BaseSessionConfiguration
    protected set

  /**
   * Several server options
   */
  @get:JsonProperty("options")
  @set:JsonProperty("options")
  @field:JsonProperty("options")
  @field:JsonPropertyDescription("Several server options")
  @field:Valid
  var options: BaseOptionsConfiguration
    protected set

  /**
   * Configuration for the static files handler.
   */
  @get:JsonProperty("static")
  @set:JsonProperty("static")
  @field:JsonProperty("static")
  @field:JsonPropertyDescription("Configuration for the static files handler.")
  @field:Valid
  var staticConf: BaseStaticConfiguration
    protected set

  internal constructor() {
    address = "127.0.0.1"
    port = BigInteger("0")
    certificate = ""
    key = ""
    session = BaseSessionConfiguration()
    options = BaseOptionsConfiguration()
    staticConf = BaseStaticConfiguration()
  }

  constructor(
    address: String, port: @DecimalMin("0") @DecimalMax("65535") BigInteger,
    certificate: String, key: String, session: @Valid BaseSessionConfiguration,
    options: @Valid BaseOptionsConfiguration,
    staticConf: @Valid BaseStaticConfiguration
  ) {
    this.address = address
    this.port = port
    this.certificate = certificate
    this.key = key
    this.session = session
    this.options = options
    this.staticConf = staticConf
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseServerConfiguration

    if(address != other.address) return false
    if(port != other.port) return false
    if(certificate != other.certificate) return false
    if(key != other.key) return false
    if(session != other.session) return false
    if(options != other.options) return false
    if(staticConf != other.staticConf) return false

    return true
  }

  override fun hashCode(): Int {
    var result = address.hashCode()
    result = 31 * result + port.hashCode()
    result = 31 * result + certificate.hashCode()
    result = 31 * result + key.hashCode()
    result = 31 * result + session.hashCode()
    result = 31 * result + options.hashCode()
    result = 31 * result + staticConf.hashCode()
    return result
  }

  override fun toString(): String {
    return "(address='$address', port=$port, certificate='$certificate', key='$key', session=$session, options=$options, staticConf=$staticConf)"
  }
}

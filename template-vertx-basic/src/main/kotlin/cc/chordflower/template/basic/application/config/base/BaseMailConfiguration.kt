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
 * Information about the smtp server to use
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("address", "port", "username", "password", "secure", "from")
open class BaseMailConfiguration : Serializable {

  /**
   * The smtp server address
   */
  @get:JsonProperty("address")
  @set:JsonProperty("address")
  @field:JsonProperty("address")
  @field:JsonPropertyDescription("The smtp server address")
  var address: String
    protected set

  /**
   * The port the smtp server
   */
  @get:JsonProperty("port")
  @set:JsonProperty("port")
  @field:JsonProperty("port")
  @field:JsonPropertyDescription("The port the smtp server")
  @field:DecimalMin("1")
  @field:DecimalMax("65535")
  var port: BigInteger
    protected set

  /**
   * The smtp server username
   */
  @get:JsonProperty("username")
  @set:JsonProperty("username")
  @field:JsonProperty("username")
  @field:JsonPropertyDescription("The smtp server username")
  var username: String
    protected set

  /**
   * The smtp server username password
   */
  @get:JsonProperty("password")
  @set:JsonProperty("password")
  @field:JsonProperty("password")
  @field:JsonPropertyDescription("The smtp server username password")
  var password: String
    protected set

  /**
   * If a secure connection should be made
   */
  @get:JsonProperty("secure")
  @set:JsonProperty("secure")
  @field:JsonProperty("secure")
  @field:JsonPropertyDescription("If a secure connection should be made")
  var secure: Boolean
    protected set

  /**
   * The email address that we should sent emails from
   */
  @get:JsonProperty("from")
  @set:JsonProperty("from")
  @field:JsonProperty("from")
  @field:JsonPropertyDescription("The email address that we should sent emails from")
  var from: String
    protected set

  internal constructor() {
    address = "127.0.0.1"
    port = BigInteger("654")
    username = ""
    password = ""
    secure = false
    from = ""
  }

  constructor(
    address: String, port: @DecimalMin("1") @DecimalMax("65535") BigInteger,
    username: String, password: String, secure: Boolean, from: String
  ) {
    this.address = address
    this.port = port
    this.username = username
    this.password = password
    this.secure = secure
    this.from = from
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseMailConfiguration

    if(address != other.address) return false
    if(port != other.port) return false
    if(username != other.username) return false
    if(password != other.password) return false
    if(secure != other.secure) return false
    if(from != other.from) return false

    return true
  }

  override fun hashCode(): Int {
    var result = address.hashCode()
    result = 31 * result + port.hashCode()
    result = 31 * result + username.hashCode()
    result = 31 * result + password.hashCode()
    result = 31 * result + secure.hashCode()
    result = 31 * result + from.hashCode()
    return result
  }

  override fun toString(): String {
    return """(address='$address', port=$port, username='$username', password='$password', secure=$secure, from='$from')"""
  }
}

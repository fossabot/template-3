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
 * Describes the management configuration used to control the server
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("address", "port", "username", "password")
open class BaseManagementConfiguration : Serializable {

  /**
   * The address the management server should listen to it must be an ip address
   */
  @get:JsonProperty("address")
  @set:JsonProperty("address")
  @field:JsonProperty("address")
  @field:JsonPropertyDescription("The address the management server should listen to it must be an ip address")
  var address: String
    protected set

  /**
   * The port the management server should listen to
   */
  @get:JsonProperty("port")
  @set:JsonProperty("port")
  @field:JsonProperty("port")
  @field:JsonPropertyDescription("The port the management server should listen to")
  @field:DecimalMin("0")
  @field:DecimalMax("65535")
  var port: BigInteger
    protected set

  /**
   * The management server username
   */
  @get:JsonProperty("username")
  @set:JsonProperty("username")
  @field:JsonProperty("username")
  @field:JsonPropertyDescription("The management server username")
  var username: String
    protected set

  /**
   * The management server username password
   */
  @get:JsonProperty("password")
  @set:JsonProperty("password")
  @field:JsonProperty("password")
  @field:JsonPropertyDescription("The management server username password")
  var password: String
    protected set

  internal constructor() {
    address = "127.0.0.1"
    port = BigInteger("0")
    username = "admin"
    password = "admin123"
  }

  constructor(
    address: String, port: @DecimalMin("0") @DecimalMax("65535") BigInteger,
    username: String, password: String
  ) {
    this.address = address
    this.port = port
    this.username = username
    this.password = password
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseManagementConfiguration

    if(address != other.address) return false
    if(port != other.port) return false
    if(username != other.username) return false
    if(password != other.password) return false

    return true
  }

  override fun hashCode(): Int {
    var result = address.hashCode()
    result = 31 * result + port.hashCode()
    result = 31 * result + username.hashCode()
    result = 31 * result + password.hashCode()
    return result
  }

  override fun toString(): String {
    return """(address='$address', port=$port, username='$username', password='$password')"""
  }
}

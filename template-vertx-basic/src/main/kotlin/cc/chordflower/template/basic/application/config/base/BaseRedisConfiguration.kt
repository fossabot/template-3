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
 * Definitions related to the redis server used for cache
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("host", "port", "password", "database")
open class BaseRedisConfiguration : Serializable {

  /**
   * The redis server location
   */
  @get:JsonProperty("host")
  @set:JsonProperty("host")
  @field:JsonProperty("host")
  @field:JsonPropertyDescription("The redis server location")
  var host: String
    protected set

  /**
   * The redis server port
   */
  @get:JsonProperty("port")
  @set:JsonProperty("port")
  @field:JsonProperty("port")
  @field:JsonPropertyDescription("The redis server port")
  @field:DecimalMin("1")
  @field:DecimalMax("65535")
  var port: BigInteger
    protected set

  /**
   * The redis server password
   */
  @get:JsonProperty("password")
  @set:JsonProperty("password")
  @field:JsonProperty("password")
  @field:JsonPropertyDescription("The redis server password")
  var password: String
    protected set

  /**
   * The database to use
   */
  @get:JsonProperty("database")
  @set:JsonProperty("database")
  @field:JsonProperty("database")
  @field:JsonPropertyDescription("The database to use")
  @field:DecimalMin("0")
  var database: BigInteger
    protected set

  internal constructor() {
    host = "127.0.0.1"
    port = BigInteger("6379")
    password = ""
    database = BigInteger("0")
  }

  constructor(
    host: String, port: @DecimalMin("1") @DecimalMax("65535") BigInteger,
    password: String, database: @DecimalMin("0") BigInteger
  ) {
    this.host = host
    this.port = port
    this.password = password
    this.database = database
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseRedisConfiguration

    if(host != other.host) return false
    if(port != other.port) return false
    if(password != other.password) return false
    if(database != other.database) return false

    return true
  }

  override fun hashCode(): Int {
    var result = host.hashCode()
    result = 31 * result + port.hashCode()
    result = 31 * result + password.hashCode()
    result = 31 * result + database.hashCode()
    return result
  }

  override fun toString(): String {
    return """(host='$host', port=$port, password='$password', database=$database)"""
  }
}

package cc.chordflower.template.basic.application.config.base

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.io.Serializable
import java.math.BigInteger
import java.util.concurrent.TimeUnit
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Size

/**
 * Configuration related to the session
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("key", "maxAge")
open class BaseSessionConfiguration : Serializable {

  /**
   * The name of the session cookie
   */
  @get:JsonProperty("key")
  @set:JsonProperty("key")
  @field:JsonProperty("key")
  @field:JsonPropertyDescription("The name of the session cookie")
  @field:Size(min = 4, max = 20)
  var key: String
    protected set

  /**
   * The number of miliseconds that the session is active
   */
  @get:JsonProperty("maxAge")
  @set:JsonProperty("maxAge")
  @field:JsonProperty("maxAge")
  @field:JsonPropertyDescription("The number of miliseconds that the session is active")
  @field:DecimalMin("1")
  var maxAge: BigInteger
    protected set

  internal constructor() {
    key = "KSESSION"
    maxAge = BigInteger.valueOf(TimeUnit.HOURS.toMillis(2))
  }

  constructor(
    key: @Size(min = 4, max = 20) String, maxAge: @DecimalMin("1") BigInteger
  ) {
    this.key = key
    this.maxAge = maxAge
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseSessionConfiguration

    if(key != other.key) return false
    if(maxAge != other.maxAge) return false

    return true
  }

  override fun hashCode(): Int {
    var result = key.hashCode()
    result = 31 * result + maxAge.hashCode()
    return result
  }

  override fun toString(): String {
    return "(key='$key', maxAge=$maxAge)"
  }
}

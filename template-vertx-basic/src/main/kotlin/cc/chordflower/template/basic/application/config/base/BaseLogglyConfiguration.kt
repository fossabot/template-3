package cc.chordflower.template.basic.application.config.base

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.io.Serializable

/**
 * Definitions related to the loggly log server
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("enabled", "token")
open class BaseLogglyConfiguration : Serializable {

  /**
   * If the loggly logger is enabled
   */
  @get:JsonProperty("enabled")
  @set:JsonProperty("enabled")
  @field:JsonProperty("enabled")
  @field:JsonPropertyDescription("If the loggly logger is enabled")
  var enabled: Boolean
    protected set

  /**
   * The access token
   */
  @get:JsonProperty("token")
  @set:JsonProperty("token")
  @field:JsonProperty("token")
  @field:JsonPropertyDescription("The access token")
  var token: String
    protected set

  internal constructor() {
    enabled = false
    token = ""
  }

  constructor(enabled: Boolean, token: String) {
    this.enabled = enabled
    this.token = token
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseLogglyConfiguration

    if(enabled != other.enabled) return false
    if(token != other.token) return false

    return true
  }

  override fun hashCode(): Int {
    var result = enabled.hashCode()
    result = 31 * result + token.hashCode()
    return result
  }

  override fun toString(): String {
    return """(enabled=$enabled, token='$token')"""
  }
}

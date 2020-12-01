package cc.chordflower.template.basic.application.config.base

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.io.Serializable
import javax.validation.Valid

/**
 * Schema for the configuration file
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("\$schema", "server", "loggly", "discovery", "redis", "management", "mail")
open class BaseConfiguration : Serializable {

  /**
   * Server related properties
   */
  @get:JsonProperty("server")
  @set:JsonProperty("server")
  @field:JsonProperty("server")
  @field:JsonPropertyDescription("Server related properties")
  @field:Valid
  var server: BaseServerConfiguration
    protected set

  /**
   * Definitions related to the loggly log server
   */
  @get:JsonProperty("loggly")
  @set:JsonProperty("loggly")
  @field:JsonProperty("loggly")
  @field:JsonPropertyDescription("Definitions related to the loggly log server")
  @field:Valid
  var loggly: BaseLogglyConfiguration
    protected set

  /**
   * Definitions related to the registration in a consul server
   */
  @get:JsonProperty("discovery")
  @set:JsonProperty("discovery")
  @field:JsonProperty("discovery")
  @field:JsonPropertyDescription("Definitions related to the registration in a consul server")
  @field:Valid
  var discovery: BaseDiscoveryConfiguration
    protected set

  /**
   * Definitions related to the redis server used for cache
   */
  @get:JsonProperty("redis")
  @set:JsonProperty("redis")
  @field:JsonProperty("redis")
  @field:JsonPropertyDescription("Definitions related to the redis server used for cache")
  @field:Valid
  var redis: BaseRedisConfiguration
    protected set

  /**
   * Describes the management configuration used to control the server
   */
  @get:JsonProperty("management")
  @set:JsonProperty("management")
  @field:JsonProperty("management")
  @field:JsonPropertyDescription("Describes the management configuration used to control the server")
  @field:Valid
  var management: BaseManagementConfiguration
    protected set

  /**
   * Information about the smtp server to use
   */
  @get:JsonProperty("mail")
  @set:JsonProperty("mail")
  @field:JsonProperty("mail")
  @field:JsonPropertyDescription("Information about the smtp server to use")
  @field:Valid
  var mail: BaseMailConfiguration
    protected set

  internal constructor() {
    mail = BaseMailConfiguration()
    management = BaseManagementConfiguration()
    redis = BaseRedisConfiguration()
    discovery = BaseDiscoveryConfiguration()
    loggly = BaseLogglyConfiguration()
    server = BaseServerConfiguration()
  }

  constructor(
    server: @Valid BaseServerConfiguration, loggly: @Valid BaseLogglyConfiguration,
    discovery: @Valid BaseDiscoveryConfiguration, redis: @Valid BaseRedisConfiguration,
    management: @Valid BaseManagementConfiguration, mail: @Valid BaseMailConfiguration
  ) {
    this.server = server
    this.loggly = loggly
    this.discovery = discovery
    this.redis = redis
    this.management = management
    this.mail = mail
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseConfiguration

    if(server != other.server) return false
    if(loggly != other.loggly) return false
    if(discovery != other.discovery) return false
    if(redis != other.redis) return false
    if(management != other.management) return false
    if(mail != other.mail) return false

    return true
  }

  override fun hashCode(): Int {
    var result = server.hashCode()
    result = 31 * result + loggly.hashCode()
    result = 31 * result + discovery.hashCode()
    result = 31 * result + redis.hashCode()
    result = 31 * result + management.hashCode()
    result = 31 * result + mail.hashCode()
    return result
  }

  override fun toString(): String {
    return """(server=$server, loggly=$loggly, discovery=$discovery, redis=$redis, management=$management, mail=$mail)"""
  }
}

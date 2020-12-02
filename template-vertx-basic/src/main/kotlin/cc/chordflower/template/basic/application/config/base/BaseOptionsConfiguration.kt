package cc.chordflower.template.basic.application.config.base

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.jakewharton.byteunits.BinaryByteUnit
import java.io.Serializable
import java.math.BigInteger
import java.util.concurrent.TimeUnit
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Size

/**
 * Several server options
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("compression_level", "idle_timeout", "max_chunk_size", "max_header_size", "max_initial_line_length", "max_body_size", "csrf_cookie_name", "csrf_header_name", "csrf_cookie_timeout")
open class BaseOptionsConfiguration : Serializable {

  /**
   * The level of compression of responses (0 disables it)
   */
  @get:JsonProperty("compression_level")
  @set:JsonProperty("compression_level")
  @field:JsonProperty("compression_level")
  @field:JsonPropertyDescription("The level of compression of responses (0 disables it)")
  @field:DecimalMin("0")
  @field:DecimalMax("10")
  var compressionLevel: BigInteger
    protected set

  /**
   * The number of miliseconds a idle connection should stay open
   */
  @get:JsonProperty("idle_timeout")
  @set:JsonProperty("idle_timeout")
  @field:JsonProperty("idle_timeout")
  @field:JsonPropertyDescription("The number of miliseconds a idle connection should stay open")
  @field:DecimalMin("0")
  var idleTimeout: BigInteger
    protected set

  /**
   * The maximum HTTP chunk size in bytes
   */
  @get:JsonProperty("max_chunk_size")
  @set:JsonProperty("max_chunk_size")
  @field:JsonProperty("max_chunk_size")
  @field:JsonPropertyDescription("The maximum HTTP chunk size in bytes")
  @field:DecimalMin("1")
  var maxChunkSize: BigInteger
    protected set

  /**
   * The maximum total Header size in bytes
   */
  @get:JsonProperty("max_header_size")
  @set:JsonProperty("max_header_size")
  @field:JsonProperty("max_header_size")
  @field:JsonPropertyDescription("The maximum total Header size in bytes")
  @field:DecimalMin("1")
  var maxHeaderSize: BigInteger
    protected set

  /**
   * The maximum size of the initial line
   */
  @get:JsonProperty("max_initial_line_length")
  @set:JsonProperty("max_initial_line_length")
  @field:JsonProperty("max_initial_line_length")
  @field:JsonPropertyDescription("The maximum size of the initial line")
  @field:DecimalMin("1")
  var maxInitialLineLength: BigInteger
    protected set

  /**
   * The maximum size of a request body in bytes
   */
  @get:JsonProperty("max_body_size")
  @set:JsonProperty("max_body_size")
  @field:JsonProperty("max_body_size")
  @field:JsonPropertyDescription("The maximum size of a request body in bytes")
  @field:DecimalMin("1")
  var maxBodySize: BigInteger
    protected set

  /**
   * The name of the csrf cookie to send
   */
  @get:JsonProperty("csrf_cookie_name")
  @set:JsonProperty("csrf_cookie_name")
  @field:JsonProperty("csrf_cookie_name")
  @field:JsonPropertyDescription("The name of the csrf cookie to send")
  @field:Size(min = 4, max = 30)
  var csrfCookieName: String
    protected set

  /**
   * The name of the csrf header to expect
   */
  @get:JsonProperty("csrf_header_name")
  @set:JsonProperty("csrf_header_name")
  @field:JsonProperty("csrf_header_name")
  @field:JsonPropertyDescription("The name of the csrf header to expect")
  @field:Size(min = 4, max = 30)
  var csrfHeaderName: String
    protected set

  /**
   * The timeout of the csrf cookie in miliseconds
   */
  @get:JsonProperty("csrf_cookie_timeout")
  @set:JsonProperty("csrf_cookie_timeout")
  @field:JsonProperty("csrf_cookie_timoeut")
  @field:JsonPropertyDescription("The timeout of the csrf cookie in miliseconds")
  @field:DecimalMin("0")
  var csrfCookieTimeout: BigInteger
    protected set

  internal constructor() {
    compressionLevel = BigInteger("2")
    idleTimeout = BigInteger.valueOf(TimeUnit.SECONDS.toMillis(20))
    maxChunkSize = BigInteger.valueOf(BinaryByteUnit.MEBIBYTES.toBytes(2))
    maxHeaderSize = BigInteger.valueOf(BinaryByteUnit.KIBIBYTES.toBytes(512))
    maxInitialLineLength = BigInteger("1024") //bytes
    maxBodySize = BigInteger.valueOf(BinaryByteUnit.MEBIBYTES.toBytes(25))
    csrfCookieName = "XSRF-TOKEN"
    csrfHeaderName = "X-XSRF-TOKEN"
    csrfCookieTimeout = BigInteger.valueOf(TimeUnit.MINUTES.toMillis(2))
  }

  constructor(
    compressionLevel: @DecimalMin("0") @DecimalMax("10") BigInteger,
    idleTimeout: @DecimalMin("0") BigInteger,
    maxChunkSize: @DecimalMin("1") BigInteger,
    maxHeaderSize: @DecimalMin("1") BigInteger,
    maxInitialLineLength: @DecimalMin("1") BigInteger,
    maxBodySize: @DecimalMin("1") BigInteger,
    csrfCookieName: @Size(min = 4, max = 30) String,
    csrfHeaderName: @Size(min = 4, max = 30) String,
    csrfCookieTimeout: @DecimalMin("0") BigInteger
  ) {
    this.compressionLevel = compressionLevel
    this.idleTimeout = idleTimeout
    this.maxChunkSize = maxChunkSize
    this.maxHeaderSize = maxHeaderSize
    this.maxInitialLineLength = maxInitialLineLength
    this.maxBodySize = maxBodySize
    this.csrfCookieName = csrfCookieName
    this.csrfHeaderName = csrfHeaderName
    this.csrfCookieTimeout = csrfCookieTimeout
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseOptionsConfiguration

    if(compressionLevel != other.compressionLevel) return false
    if(idleTimeout != other.idleTimeout) return false
    if(maxChunkSize != other.maxChunkSize) return false
    if(maxHeaderSize != other.maxHeaderSize) return false
    if(maxInitialLineLength != other.maxInitialLineLength) return false
    if(maxBodySize != other.maxBodySize) return false
    if(csrfCookieName != other.csrfCookieName) return false
    if(csrfHeaderName != other.csrfHeaderName) return false
    if(csrfCookieTimeout != other.csrfCookieTimeout) return false

    return true
  }

  override fun hashCode(): Int {
    var result = compressionLevel.hashCode()
    result = 31 * result + idleTimeout.hashCode()
    result = 31 * result + maxChunkSize.hashCode()
    result = 31 * result + maxHeaderSize.hashCode()
    result = 31 * result + maxInitialLineLength.hashCode()
    result = 31 * result + maxBodySize.hashCode()
    result = 31 * result + csrfCookieName.hashCode()
    result = 31 * result + csrfHeaderName.hashCode()
    result = 31 * result + csrfCookieTimeout.hashCode()
    return result
  }

  override fun toString(): String {
    return """(compressionLevel=$compressionLevel, idleTimeout=$idleTimeout, maxChunkSize=$maxChunkSize, maxHeaderSize=$maxHeaderSize, maxInitialLineLength=$maxInitialLineLength, maxBodySize=$maxBodySize, csrfCookieName='$csrfCookieName', csrfHeaderName='$csrfHeaderName', csrfCookieTimout=$csrfCookieTimeout)"""
  }
}

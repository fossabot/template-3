package cc.chordflower.template.basic.application.config.base

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.io.Serializable
import java.math.BigInteger
import java.util.concurrent.TimeUnit

/**
 * Configuration for the static files handler.
 */
@Suppress("unused")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("index_page", "max_cache_time")
open class BaseStaticConfiguration : Serializable {

  /**
   * The index or initial page.
   */
  @get:JsonProperty("index_page")
  @set:JsonProperty("index_page")
  @field:JsonProperty("index_page")
  @field:JsonPropertyDescription("The index or initial page.")
  var indexPage: String
    protected set

  /**
   * The maximum time a static file should be allowed to stay in the browsers cache in miliseconds.
   */
  @get:JsonProperty("max_cache_time")
  @set:JsonProperty("max_cache_time")
  @field:JsonProperty("max_cache_time")
  @field:JsonPropertyDescription("The maximum time a static file should be allowed to stay in the browsers cache in miliseconds.")
  var maxCacheTime: BigInteger
    protected set

  internal constructor() {
    indexPage = "index.html"
    maxCacheTime = BigInteger.valueOf(TimeUnit.DAYS.toMillis(5))
  }

  constructor(indexPage: String, maxCacheTime: BigInteger) {
    this.indexPage = indexPage
    this.maxCacheTime = maxCacheTime
  }

  override fun equals(other: Any?): Boolean {
    if(this === other) return true
    if(javaClass != other?.javaClass) return false

    other as BaseStaticConfiguration

    if(indexPage != other.indexPage) return false
    if(maxCacheTime != other.maxCacheTime) return false

    return true
  }

  override fun hashCode(): Int {
    var result = indexPage.hashCode()
    result = 31 * result + maxCacheTime.hashCode()
    return result
  }

  override fun toString(): String {
    return """{"indexPage": "$indexPage", "maxCacheTime": $maxCacheTime}"""
  }
}

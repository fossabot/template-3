package cc.chordflower.template.basic.application.config

import cc.chordflower.template.basic.application.config.base.BaseOptionsConfiguration
import cc.chordflower.template.basic.application.utils.ValidatedObject
import io.vertx.core.json.JsonObject
import java.math.BigInteger
import java.util.*
import javax.validation.Validator

class OptionsConfiguration : BaseOptionsConfiguration, ValidatedObject {

  constructor(it: JsonObject?) : super() {
    Objects.requireNonNull(it)
    if(it != null) {
      this.compressionLevel = BigInteger.valueOf(it.getLong("compression_level", this.compressionLevel.toLong()))
      this.csrfCookieName = it.getString("csrf_cookie_name", this.csrfCookieName)
      this.csrfCookieTimeout = BigInteger.valueOf(it.getLong("csrf_cookie_timeout", this.csrfCookieTimeout.toLong()))
      this.csrfHeaderName = it.getString("csrf_header_name", this.csrfHeaderName)
      this.idleTimeout = BigInteger.valueOf(it.getLong("idle_timeout", this.idleTimeout.toLong()))
      this.maxBodySize = BigInteger.valueOf(it.getLong("max_body_size", this.maxBodySize.toLong()))
      this.maxChunkSize = BigInteger.valueOf(it.getLong("max_chunk_size", this.maxChunkSize.toLong()))
      this.maxHeaderSize = BigInteger.valueOf(it.getLong("max_header_size", this.maxHeaderSize.toLong()))
      this.maxInitialLineLength = BigInteger.valueOf(it.getLong("max_initial_line_length", this.maxInitialLineLength.toLong()))
    }
  }

  override fun valid(validator: Validator): Boolean {
    return validator.validate(this).isNotEmpty()
  }
}

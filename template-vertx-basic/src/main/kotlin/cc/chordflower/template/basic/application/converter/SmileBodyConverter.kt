package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.dataformat.smile.databind.SmileMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from a smile byte array.
 */
@Singleton
@Named
open class SmileBodyConverter @Inject constructor(private val smileMapper: SmileMapper) : BodyConverter {

  /**
   * Returns true if the media type represents a smile media type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return when {
      mediaType.mediaType.endsWith("+smile", true) -> true
      MediaType.APPLICATION_SMILE == mediaType -> true
      else -> false
    }
  }

  /**
   * Converts a smile byte array into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.smileMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a smile byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.smileMapper.writeValueAsBytes(source)
  }
}

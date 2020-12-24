package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.databind.json.JsonMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from a json byte array.
 */
@Singleton
@Named
open class JsonBodyConverter @Inject constructor(private val jsonMapper: JsonMapper) : BodyConverter {

  /**
   * Returns true if the given media type is a json media type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return when {
      mediaType.mediaType.endsWith("+json", true) -> true
      MediaType.APPLICATION_JSON == mediaType -> true
      else -> false
    }
  }

  /**
   * Converts a byte array representing json into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return jsonMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a json byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return jsonMapper.writeValueAsBytes(source)
  }
}

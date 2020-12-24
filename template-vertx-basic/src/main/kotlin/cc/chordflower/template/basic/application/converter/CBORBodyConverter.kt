package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.dataformat.cbor.databind.CBORMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from a cbor byte array.
 */
@Singleton
@Named
open class CBORBodyConverter @Inject constructor(private val cborMapper: CBORMapper) : BodyConverter {

  /**
   * Returns true if this media type is a cbor medit type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return when {
      mediaType.mediaType.endsWith("+cbor", true) -> true
      MediaType.APPLICATION_CBOR == mediaType -> true
      else -> false
    }
  }

  /**
   * Converts a cbor byte array into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.cborMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a cbor byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.cborMapper.writeValueAsBytes(source)
  }
}

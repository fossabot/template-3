package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.dataformat.ion.IonObjectMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from an ion byte array.
 */
@Singleton
@Named
open class IonBodyConverter @Inject constructor(private val ionObjectMapper: IonObjectMapper) : BodyConverter {

  /**
   * Returns true if the media type represents a ion media type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return when {
      mediaType.mediaType.endsWith("+ion", true) -> true
      MediaType.APPLICATION_ION == mediaType -> true
      else -> false
    }
  }

  /**
   * Converts an ion byte array into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.ionObjectMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into an ion byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.ionObjectMapper.writeValueAsBytes(source)
  }
}

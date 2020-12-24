package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from a java properties byte array.
 */
@Singleton
@Named
open class PropertiesBodyConverter @Inject constructor(private val javaPropsMapper: JavaPropsMapper) : BodyConverter {

  /**
   * Returns true if this mime type represents a java properties mime type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return MediaType.TEXT_X_JAVA_PROPERTIES == mediaType
  }

  /**
   * Converts a java properties byte array into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.javaPropsMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a java properties byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.javaPropsMapper.writeValueAsBytes(source)
  }
}

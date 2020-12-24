package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from a xml byte array.
 */
@Singleton
@Named
open class XmlBodyConverter @Inject constructor(private val xmlMapper: XmlMapper) : BodyConverter {

  /**
   * Returns true if this mime type represents an xml based mime type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return when {
      mediaType.mediaType.endsWith("+xml", true) -> true
      mediaType == MediaType.APPLICATION_XML -> true
      mediaType == MediaType.TEXT_XML -> true
      else -> false
    }
  }

  /**
   * Converts a xml byte array into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.xmlMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a xml byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.xmlMapper.writeValueAsBytes(source)
  }
}

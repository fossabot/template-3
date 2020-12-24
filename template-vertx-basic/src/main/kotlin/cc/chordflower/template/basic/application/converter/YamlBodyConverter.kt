package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from a yaml byte array.
 */
@Singleton
@Named
open class YamlBodyConverter @Inject constructor(private val yamlMapper: YAMLMapper) : BodyConverter {

  /**
   * Returns true if the given media type is a yaml media type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return mediaType == MediaType.TEXT_YAML
  }

  /**
   * Converts a byte array representing yaml into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.yamlMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a yaml byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.yamlMapper.writeValueAsBytes(source)
  }
}

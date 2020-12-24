package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class converts a object to and from a byte array representing csv.
 */
@Singleton
@Named
open class CsvBodyConverter @Inject constructor(private val csvMapper: CsvMapper) : BodyConverter {

  /**
   * Returns true if media type represents a csv media type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return mediaType == MediaType.TEXT_CSV
  }

  /**
   * Converts a csv byte array into the destiny class if possible.
   *
   * Note that the destiny type, **MUST** be a **list** of objects, since
   * csv is itself a list of values.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.csvMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a csv byte array.
   *
   * Note that the source, **MUST** be a **list** of objects, since
   * csv is itself a list of values.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.csvMapper.writeValueAsBytes(source)
  }
}

package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.databind.ObjectMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from a cbor byte array.
 */
@Singleton
@Named
open class BSONBodyConverter @Inject constructor(@Named("BsonMapper") private val bsonMapper: ObjectMapper) : BodyConverter {

  /**
   * Returns true if the media type is a bson media type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return when {
      mediaType.mediaType.endsWith("+bson", true) -> true
      MediaType.APPLICATION_BSON == mediaType -> true
      else -> false
    }
  }

  /**
   * Converts a bson byte array into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.bsonMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a bson byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.bsonMapper.writeValueAsBytes(source)
  }
}

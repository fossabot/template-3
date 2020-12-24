package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType
import com.fasterxml.jackson.databind.ObjectMapper
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Class that converts an object to and from a message pack byte array.
 */
@Singleton
@Named
open class MessagePackBodyConverter : BodyConverter {
  private val messagePackMapper : ObjectMapper

  @Inject
  constructor( @Named("messagePackMapper") messagePackMapper : ObjectMapper ) {
    this.messagePackMapper = messagePackMapper
  }

  /**
   * Returns true if this media type represents a message pack media type.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  override fun canConvert(mediaType: MediaType): Boolean {
    return MediaType.APPLICATION_X_MSGPACK == mediaType
  }

  /**
   * Converts a message pack byte array into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  override fun <T> convertTo(source: ByteArray, destiny: Class<T>): T {
    return this.messagePackMapper.readValue(source, destiny)
  }

  /**
   * Converts a source object into a message pack byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  override fun <T> convertFrom(source: T): ByteArray {
    return this.messagePackMapper.writeValueAsBytes(source)
  }
}

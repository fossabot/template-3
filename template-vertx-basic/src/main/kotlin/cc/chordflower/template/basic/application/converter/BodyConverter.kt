package cc.chordflower.template.basic.application.converter

import cc.chordflower.template.basic.application.controllers.MediaType

/**
 * Interface that specified a body converter.
 */
interface BodyConverter {
  /**
   * Returns true if this converter can convert the given media type to a byte array
   * or from a byte array.
   *
   * @param mediaType The media type to check for conversion.
   * @return True, if the conversion is possible.
   */
  fun canConvert( mediaType : MediaType ) : Boolean

  /**
   * Converts a byte array into the destiny class if possible.
   *
   * @param source The source byte array.
   * @param destiny The class of the destiny type.
   * @return The converted byte array.
   */
  fun <T> convertTo( source : ByteArray, destiny : Class<T> ) : T

  /**
   * Converts a source object into a byte array.
   *
   * @param source The source object.
   * @return A byte array representing the object.
   */
  fun <T> convertFrom( source : T ) : ByteArray
}

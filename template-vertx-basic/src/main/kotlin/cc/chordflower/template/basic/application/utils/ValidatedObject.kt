package cc.chordflower.template.basic.application.utils

import javax.validation.Validator

/**
 * Specifies that a object, can be validated using a javax.validator.
 */
interface ValidatedObject {
  /**
   * Checks if this object is valid.
   *
   * @param validator The validator to use.
   * @return True if it is, false otherwise.
   */
  fun valid( validator : Validator ) : Boolean
}

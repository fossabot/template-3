package cc.chordflower.template.basic.application.controllers

/**
 * Marks the given method as a rest enabled method.
 */
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class WebMethod(
  /**
   * The http method to use in the requests (default is GET).
   */
  val type: HttpMethodEnum = HttpMethodEnum.GET,
  /**
   * What this method sends as in the response body (default *//* aka any mediatype)
   */
  val produces: MediaType = MediaType.ANY_ANY,
  /**
   * The path this method is available (default is empty aka the same as the class Resource path)
   */
  val path: String = "",
  /**
   * What this method consumes as the request body (default *//* aka any mediatype)
   */
  val consumes: MediaType = MediaType.ANY_ANY)

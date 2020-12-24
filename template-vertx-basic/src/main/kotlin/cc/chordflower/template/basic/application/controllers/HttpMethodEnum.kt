package cc.chordflower.template.basic.application.controllers

import io.vertx.core.http.HttpMethod
import java.util.*

/**
 * This is an enum to map all available vertx HttpMethods so that
 * they can be used in annotations (and therefore be compile time constants).
 */
enum class HttpMethodEnum(val method: HttpMethod) {
  /**
   * The RFC 2616 `OPTIONS` method.
   */
  OPTIONS( HttpMethod.OPTIONS ),

  /**
   * The RFC 2616 `GET` method.
   */
  GET( HttpMethod.GET ),

  /**
   * The RFC 2616 `HEAD` method.
   */
  HEAD( HttpMethod.HEAD ),

  /**
   * The {RFC 2616 @code POST` method.
   */
  POST( HttpMethod.POST ),

  /**
   * The RFC 2616 `PUT` method.
   */
  PUT( HttpMethod.PUT ),

  /**
   * The RFC 2616 `DELETE` method.
   */
  DELETE( HttpMethod.DELETE ),

  /**
   * The RFC 2616 `TRACE` method.
   */
  TRACE( HttpMethod.TRACE ),

  /**
   * The RFC 2616 `CONNECT` method.
   */
  CONNECT( HttpMethod.CONNECT ),

  /**
   * The RFC 5789 `PATCH` method.
   */
  PATCH( HttpMethod.PATCH ),

  /**
   * The RFC 2518/4918 `PROPFIND` method.
   */
  PROPFIND( HttpMethod.PROPFIND ),

  /**
   * The RFC 2518/4918 `PROPPATCH` method.
   */
  PROPPATCH( HttpMethod.PROPPATCH ),

  /**
   * The RFC 2518/4918 `MKCOL` method.
   */
  MKCOL( HttpMethod.MKCOL ),

  /**
   * The RFC 2518/4918 `COPY` method.
   */
  COPY( HttpMethod.COPY ),

  /**
   * The RFC 2518/4918 `MOVE` method.
   */
  MOVE( HttpMethod.MOVE ),

  /**
   * The RFC 2518/4918 `LOCK` method.
   */
  LOCK( HttpMethod.LOCK ),

  /**
   * The RFC 2518/4918 `UNLOCK` method.
   */
  UNLOCK( HttpMethod.UNLOCK ),

  /**
   * The RFC 4791 `MKCALENDAR` method.
   */
  MKCALENDAR( HttpMethod.MKCALENDAR ),

  /**
   * The RFC 3253 `VERSION_CONTROL` method.
   */
  VERSION_CONTROL( HttpMethod.VERSION_CONTROL ),

  /**
   * The RFC 3253 `REPORT` method.
   */
  REPORT( HttpMethod.REPORT ),

  /**
   * The RFC 3253 `CHECKOUT` method.
   */
  CHECKOUT( HttpMethod.CHECKOUT ),

  /**
   * The RFC 3253 `CHECKIN` method.
   */
  CHECKIN( HttpMethod.CHECKIN ),

  /**
   * The RFC 3253 `UNCHECKOUT` method.
   */
  UNCHECKOUT( HttpMethod.UNCHECKOUT ),

  /**
   * The RFC 3253 `MKWORKSPACE` method.
   */
  MKWORKSPACE( HttpMethod.MKWORKSPACE ),

  /**
   * The RFC 3253 `UPDATE` method.
   */
  UPDATE( HttpMethod.UPDATE ),

  /**
   * The RFC 3253 `LABEL` method.
   */
  LABEL( HttpMethod.LABEL ),

  /**
   * The RFC 3253 `MERGE` method.
   */
  MERGE( HttpMethod.MERGE ),

  /**
   * The RFC 3253 `BASELINE_CONTROL` method.
   */
  BASELINE_CONTROL( HttpMethod.BASELINE_CONTROL ),

  /**
   * The RFC 3253 `MKACTIVITY` method.
   */
  MKACTIVITY( HttpMethod.MKACTIVITY ),

  /**
   * The RFC 3648 `ORDERPATCH` method.
   */
  ORDERPATCH( HttpMethod.ORDERPATCH ),

  /**
   * The RFC 3744 `ACL` method.
   */
  ACL( HttpMethod.ACL ),

  /**
   * The RFC 5323 `SEARCH` method.
   */
  SEARCH( HttpMethod.SEARCH );

  companion object {
    /**
     * Gets an HttpMethodEnum given a method string.
     *
     * @param method The string method.
     * @return The corresponding HttpMethodEnum.
     * @throws EnumConstantNotPresentException If the method does not exist in the enum.
     */
    fun fromMethodString( method : String ) : HttpMethodEnum {
      return Arrays.stream( values() )
        .filter( { it.method.name().equals( method, true ) } )
        .findFirst().orElseThrow( { EnumConstantNotPresentException( ACL.declaringClass, method ) } )
    }

    /**
     * Gets an HttpMethodEnum given a vertx HttpMethod.
     *
     * @param httpMethod The vertx HttpMethod.
     * @return The corresponding HttpMethodEnum.
     * @throws EnumConstantNotPresentException If the method does not exist in the enum.
     */
    fun fromHttpMethod( httpMethod: HttpMethod ) : HttpMethodEnum {
      return Arrays.stream( values() )
        .filter( { it.method.equals(httpMethod) } )
        .findFirst().orElseThrow( { EnumConstantNotPresentException( ACL.declaringClass, httpMethod.name() ) } )
    }

  }

}

package cc.chordflower.template.basic.application.security

import cc.chordflower.template.basic.application.config.Configuration
import io.vertx.core.AsyncResult
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.auth.authentication.AuthenticationProvider
import io.vertx.ext.auth.authentication.UsernamePasswordCredentials


@Suppress("JoinDeclarationAndAssignment")
class AppAuthenticationProvider : AuthenticationProvider {
  private val user : String
  private val password : String

  constructor(configuration: Configuration) {
    this.user = configuration.management.username
    this.password = configuration.management.password
  }

  /**
   * Authenticate a user.
   *
   * If the user is successfully authenticated a [User] object is passed to the handler in an [AsyncResult].
   * The user object can then be used for authorisation.
   *
   * @param credentials The credentials
   * @param resultHandler The result handler
   */
  override fun authenticate(credentials: JsonObject?, resultHandler: Handler<AsyncResult<User>>?) {
    val passwordCredentials = UsernamePasswordCredentials(credentials)
    when {
      passwordCredentials.username.isNullOrEmpty() || passwordCredentials.password.isNullOrEmpty() -> {
        resultHandler?.handle(Future.failedFuture("The given username or password is invalid"))
      }
      passwordCredentials.username != user -> {
        resultHandler?.handle(Future.failedFuture("The given username or password is invalid"))
      }
      !Argon2.verify(this.password, passwordCredentials.password.toCharArray()) -> {
        resultHandler?.handle(Future.failedFuture("The given username or password is invalid"))
      }
      else -> {
        resultHandler?.handle(Future.succeededFuture(User.fromName(user)))
      }
    }
  }
}

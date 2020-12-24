package cc.chordflower.template.basic.application.controllers

import io.vertx.ext.web.Router
import io.vertx.kotlin.core.Vertx

interface IController {
  fun configure(router: Router, vertx: Vertx)
}

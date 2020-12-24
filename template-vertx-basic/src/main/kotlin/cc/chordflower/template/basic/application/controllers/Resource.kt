package cc.chordflower.template.basic.application.controllers

/**
 * Indicates that the given class is available as a rest resource
 * at the given path.
 */
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class Resource(val path: String)

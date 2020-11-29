package cc.chordflower.template.basic

import cc.chordflower.template.basic.application.events.Event
import cc.chordflower.template.basic.application.utils.currentEnvPath
import io.vertx.config.ConfigRetriever
import io.vertx.config.ConfigRetrieverOptions
import io.vertx.config.ConfigStoreOptions
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import org.apache.deltaspike.cdise.api.CdiContainerLoader
import org.apache.deltaspike.core.api.provider.BeanProvider
import org.greenrobot.eventbus.EventBus
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.slf4j.bridge.SLF4JBridgeHandler
import java.nio.file.Paths
import javax.enterprise.context.ApplicationScoped

object TemplateApp : Runnable {
  internal var args: Array<String> = arrayOf()

  private val logger : Logger = LoggerFactory.getLogger(TemplateApp::class.java)

  override fun run() {
    SLF4JBridgeHandler.removeHandlersForRootLogger()
    SLF4JBridgeHandler.install()
    val cdiContainer = CdiContainerLoader.getCdiContainer()
    cdiContainer.boot()

    Runtime.getRuntime().addShutdownHook( Thread {
      cdiContainer.shutdown()
    } )

    val contextControl = cdiContainer.contextControl
    contextControl.startContext(ApplicationScoped::class.java)

    val eventBus = BeanProvider.getContextualReference(EventBus::class.java)
    eventBus.post(Event.BeforeStartEvent())

    eventBus.post(Event.ParseArgumentsEvent(io.vavr.collection.Array.of(*args)))

    val vertx = Vertx.vertx()
    val options = ConfigRetrieverOptions().setIncludeDefaultStores(false)
    options.addStore(jsonFileConfigStore.setConfig(JsonObject().put("path", "./config.json")))
      .addStore(yamlFileConfigStore.setConfig(JsonObject().put("path", "./config.yaml")))
      .addStore(jsonFileConfigStore.setConfig(JsonObject().put("path",
        Paths.get(currentEnvPath.systemConfigPath.toString(), "config.json"))))
      .addStore(jsonFileConfigStore.setConfig(JsonObject().put("path",
        Paths.get(currentEnvPath.systemConfigPath.toString(), "config.yaml"))))
      .addStore(jsonFileConfigStore.setConfig(JsonObject().put("path",
        Paths.get(currentEnvPath.userConfigPath.toString(), "config.json"))))
      .addStore(jsonFileConfigStore.setConfig(JsonObject().put("path",
        Paths.get(currentEnvPath.userConfigPath.toString(), "config.yaml"))))

    options.addStore(environmentConfigStore)
    options.scanPeriod = Long.MAX_VALUE

    val retriever = ConfigRetriever.create(vertx, options)
    retriever.getConfig { json ->
      if(!json.failed()) {
        logger.info("Parsed the configuration!")
      } else {
        logger.error("Configuration parsing failed!", json.cause())
      }
    }
  }

  private val environmentConfigStore: ConfigStoreOptions
    get() = ConfigStoreOptions().setType("env").setConfig(JsonObject().put("raw-data", true))

  private val jsonFileConfigStore: ConfigStoreOptions
    get() = ConfigStoreOptions().setType("file").setFormat("json")

  private val yamlFileConfigStore: ConfigStoreOptions
    get() = ConfigStoreOptions().setType("file").setFormat("yaml")
}

fun main(args: Array<String>) {
  TemplateApp.args = args
  TemplateApp.run()
}

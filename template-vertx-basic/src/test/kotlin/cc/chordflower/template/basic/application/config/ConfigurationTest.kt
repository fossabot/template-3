package cc.chordflower.template.basic.application.config

import com.winterbe.expekt.expect
import io.kotest.core.spec.style.DescribeSpec
import io.vertx.core.json.JsonObject
import java.math.BigInteger

class ConfigurationTest : DescribeSpec({

  describe("With a configuration file", {
    var configuration : Configuration
    context("Given that is empty, ", {
      configuration = Configuration(JsonObject())
      it("should give the default values", {
        expect(configuration.discovery.enabled).to.be.`false`
        expect(configuration.discovery.host).to.be.equal("127.0.0.1")
        expect(configuration.discovery.port).to.be.equal(BigInteger("8500"))
        expect(configuration.mail.address).to.be.equal("127.0.0.1")
        expect(configuration.mail.secure).to.be.`false`
        expect(configuration.management.address).to.be.equal("127.0.0.1")
        expect(configuration.management.username).to.be.equal("admin")
        expect(configuration.management.password).to.be.equal("admin123")
      })
    })
    context("Given that is partially empty, ", {
      configuration = Configuration(JsonObject()
        .put("mail", JsonObject()
          .put("address","smtp.gmail.com")
          .put("port",654L)
          .put("username", "")
          .put("password", "")
          .put("secure", true)
          .put("from", "")
        ))
      it("should give the default values, for empty configurations", {
        expect(configuration.discovery.enabled).to.be.`false`
        expect(configuration.discovery.host).to.be.equal("127.0.0.1")
        expect(configuration.discovery.port).to.be.equal(BigInteger("8500"))
        expect(configuration.management.address).to.be.equal("127.0.0.1")
        expect(configuration.management.username).to.be.equal("admin")
        expect(configuration.management.password).to.be.equal("admin123")
      })
      it("should give the provided values", {
        expect(configuration.mail.address).to.be.equal("smtp.gmail.com")
        expect(configuration.mail.secure).to.be.`true`
      })
    })
  })
})

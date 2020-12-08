package cc.chordflower.template.basic.application.security

import org.bouncycastle.crypto.generators.Argon2BytesGenerator
import org.bouncycastle.crypto.params.Argon2Parameters
import org.bouncycastle.util.encoders.Base64
import java.util.*

object Argon2 {
  private const val HASH_SIZE = 32

  fun decode( text: String ) : Pair<Argon2Parameters, ByteArray> {
    val values = text.split("$")
    if(values.size != 6) {
      throw IllegalArgumentException("The given text is not a valid argon2 value!")
    } else if("argon2id" == values[1]) {
      throw IllegalArgumentException("The given text is not a valid argon2 value!")
    } else {
      val rawParameters = values[3].split(",")
      if( rawParameters.size != 3 ) {
        throw IllegalArgumentException("The given text is not a valid argon2 value!")
      } else {
        val regex = Regex("([mtp])=(\\d+)")
        var memory = 0
        var iterations = 0
        var paralelism = 0
        for(result in regex.findAll(values[3])) {
          when {
            result.groups.size != 2 -> {
              throw IllegalArgumentException("The given text is not a valid argon2 value!")
            }
            "m" == result.groups[0]?.value -> {
              memory = result.groups[1]?.value?.toInt() ?: 0
            }
            "t" == result.groups[0]?.value -> {
              iterations = result.groups[1]?.value?.toInt() ?: 0
            }
            "p" == result.groups[0]?.value -> {
              paralelism = result.groups[1]?.value?.toInt() ?: 0
            }
            else -> {
              throw IllegalArgumentException("The given text is not a valid argon2 value!")
            }
          }
        }
        if(0 == memory || 0 == iterations || 0 == paralelism) {
          throw IllegalArgumentException("The given text is not a valid argon2 value!")
        }
        val parameters = Argon2Parameters.Builder(Argon2Parameters.ARGON2_id)
          .withParallelism(paralelism)
          .withMemoryAsKB(memory)
          .withIterations(iterations)
          .withSalt(Base64.decode(values[4]))
          .build()
        return Pair( parameters, Base64.decode(values[5]) )
      }
    }
  }

  fun encode( parameters: Argon2Parameters, hash: ByteArray ) : String {
    Objects.requireNonNull(parameters, "Parameters must not be null")
    Objects.requireNonNull(hash, "Hash must not be null")
    if(Argon2Parameters.ARGON2_id == parameters.type) {
      return """${'$'}argon2id${'$'}v=${parameters.version}${'$'}m=${parameters.memory},t=${parameters.iterations},p=${parameters.lanes}${'$'}${Base64.toBase64String(parameters.salt)}${'$'}${Base64.toBase64String(hash)}"""
    } else {
      throw IllegalArgumentException("The parameters are invalid")
    }
  }

  fun verify( value: String, password: CharArray ) : Boolean {
    val res = this.decode(value)
    val generator = Argon2BytesGenerator()
    generator.init(res.first)
    val out = ByteArray(HASH_SIZE)
    generator.generateBytes(password, out)
    return res.second.contentEquals(out)
  }
}

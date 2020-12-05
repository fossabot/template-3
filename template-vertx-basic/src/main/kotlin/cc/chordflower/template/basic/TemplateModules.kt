package cc.chordflower.template.basic

import cc.chordflower.template.basic.application.config.base.BaseLogglyConfiguration
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.ext.loggly.LogglyAppender
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.blackbird.BlackbirdModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.mrbean.MrBeanModule
import com.fasterxml.jackson.module.paranamer.ParanamerModule
import io.vavr.jackson.datatype.VavrModule
import net.logstash.logback.composite.ContextJsonProvider
import net.logstash.logback.composite.JsonProviders
import net.logstash.logback.composite.loggingevent.CallerDataJsonProvider
import net.logstash.logback.composite.loggingevent.LogLevelJsonProvider
import net.logstash.logback.composite.loggingevent.LoggerNameJsonProvider
import net.logstash.logback.composite.loggingevent.LoggingEventFormattedTimestampJsonProvider
import net.logstash.logback.composite.loggingevent.LoggingEventNestedJsonProvider
import net.logstash.logback.composite.loggingevent.LogstashMarkersJsonProvider
import net.logstash.logback.composite.loggingevent.MdcJsonProvider
import net.logstash.logback.composite.loggingevent.MessageJsonProvider
import net.logstash.logback.composite.loggingevent.RootStackTraceElementJsonProvider
import net.logstash.logback.composite.loggingevent.SequenceJsonProvider
import net.logstash.logback.composite.loggingevent.StackTraceJsonProvider
import net.logstash.logback.composite.loggingevent.TagsJsonProvider
import net.logstash.logback.layout.LoggingEventCompositeJsonLayout
import net.logstash.logback.stacktrace.ShortenedThrowableConverter
import org.greenrobot.eventbus.EventBus
import org.jetbrains.annotations.NotNull
import javax.enterprise.inject.Produces
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Named
class TemplateModules {

  @Singleton
  @Produces
  @NotNull
  @Named("eventBus")
  fun createEventBus(): EventBus {
    return EventBus.builder()
      .logNoSubscriberMessages(false)
      .sendNoSubscriberEvent(false)
      .build()
  }

  @Singleton
  @Produces
  @NotNull
  @Named("jsonMapper")
  fun createJsonMapper( ) : JsonMapper {
    return JsonMapper.builder()
      .addModule(BlackbirdModule())
      .addModule(MrBeanModule())
      .addModule(ParanamerModule())
      .addModule(JavaTimeModule())
      .addModule(VavrModule())
      .addModule(KotlinModule())
      .configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true)
      .configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, true)
      .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      .configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true)
      .configure(DeserializationFeature.WRAP_EXCEPTIONS, true)
      .configure(DeserializationFeature.EAGER_DESERIALIZER_FETCH, true)
      .configure(SerializationFeature.INDENT_OUTPUT, false)
      .configure(SerializationFeature.WRAP_EXCEPTIONS, true)
      .configure(SerializationFeature.CLOSE_CLOSEABLE, false)
      .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.EAGER_SERIALIZER_FETCH, true)
      .configure(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID, true)
      .configure(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS, false)
      .configure(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES, true)
      .build()
  }

  @Singleton
  @Produces
  @NotNull
  @Named("yamlMapper")
  fun createYAMLMapper() : YAMLMapper {
    return YAMLMapper.builder()
      .addModule(BlackbirdModule())
      .addModule(MrBeanModule())
      .addModule(ParanamerModule())
      .addModule(JavaTimeModule())
      .addModule(VavrModule())
      .addModule(KotlinModule())
      .configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true)
      .configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, true)
      .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      .configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true)
      .configure(DeserializationFeature.WRAP_EXCEPTIONS, true)
      .configure(DeserializationFeature.EAGER_DESERIALIZER_FETCH, true)
      .configure(SerializationFeature.INDENT_OUTPUT, false)
      .configure(SerializationFeature.WRAP_EXCEPTIONS, true)
      .configure(SerializationFeature.CLOSE_CLOSEABLE, false)
      .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.EAGER_SERIALIZER_FETCH, true)
      .configure(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID, true)
      .configure(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS, false)
      .configure(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES, true)
      .build()
  }

  @Singleton
  @Produces
  @NotNull
  @Named("xmlMapper")
  fun createXmlMapper() : XmlMapper {
    return XmlMapper.builder()
      .addModule(BlackbirdModule())
      .addModule(MrBeanModule())
      .addModule(ParanamerModule())
      .addModule(JavaTimeModule())
      .addModule(VavrModule())
      .addModule(KotlinModule())
      .configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true)
      .configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, true)
      .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      .configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true)
      .configure(DeserializationFeature.WRAP_EXCEPTIONS, true)
      .configure(DeserializationFeature.EAGER_DESERIALIZER_FETCH, true)
      .configure(SerializationFeature.INDENT_OUTPUT, false)
      .configure(SerializationFeature.WRAP_EXCEPTIONS, true)
      .configure(SerializationFeature.CLOSE_CLOSEABLE, false)
      .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.EAGER_SERIALIZER_FETCH, true)
      .configure(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID, true)
      .configure(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS, false)
      .configure(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES, true)
      .build()
  }

  @Singleton
  @Produces
  @NotNull
  @Named("csvMapper")
  fun createCsvMapper() : CsvMapper {
    return CsvMapper.builder()
      .addModule(BlackbirdModule())
      .addModule(MrBeanModule())
      .addModule(ParanamerModule())
      .addModule(JavaTimeModule())
      .addModule(VavrModule())
      .addModule(KotlinModule())
      .configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true)
      .configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, true)
      .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      .configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true)
      .configure(DeserializationFeature.WRAP_EXCEPTIONS, true)
      .configure(DeserializationFeature.EAGER_DESERIALIZER_FETCH, true)
      .configure(SerializationFeature.INDENT_OUTPUT, false)
      .configure(SerializationFeature.WRAP_EXCEPTIONS, true)
      .configure(SerializationFeature.CLOSE_CLOSEABLE, false)
      .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.EAGER_SERIALIZER_FETCH, true)
      .configure(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID, true)
      .configure(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS, false)
      .configure(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES, true)
      .build()
  }

  @Singleton
  @Produces
  @NotNull
  @Named("propertiesMapper")
  fun createJavaPropsMapper() : JavaPropsMapper {
    return JavaPropsMapper.builder()
      .addModule(BlackbirdModule())
      .addModule(MrBeanModule())
      .addModule(ParanamerModule())
      .addModule(JavaTimeModule())
      .addModule(VavrModule())
      .addModule(KotlinModule())
      .configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true)
      .configure(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
      .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, true)
      .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      .configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true)
      .configure(DeserializationFeature.WRAP_EXCEPTIONS, true)
      .configure(DeserializationFeature.EAGER_DESERIALIZER_FETCH, true)
      .configure(SerializationFeature.INDENT_OUTPUT, false)
      .configure(SerializationFeature.WRAP_EXCEPTIONS, true)
      .configure(SerializationFeature.CLOSE_CLOSEABLE, false)
      .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false)
      .configure(SerializationFeature.EAGER_SERIALIZER_FETCH, true)
      .configure(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID, true)
      .configure(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS, false)
      .configure(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES, true)
      .build()
  }

  @Singleton
  @Produces
  @NotNull
  @Named("loggingEventCompositeJsonLayout")
  fun createLoggingEventCompositeJsonLayout() : LoggingEventCompositeJsonLayout {
    val extra = LoggingEventNestedJsonProvider()
    extra.fieldName = "extra"
    extra.providers = JsonProviders()
    extra.providers.addProvider(CallerDataJsonProvider())
    extra.providers.addProvider(ContextJsonProvider())
    extra.providers.addProvider(MdcJsonProvider())
    extra.providers.addProvider(TagsJsonProvider())
    extra.providers.addProvider(LogstashMarkersJsonProvider())

    val shortenedThrowableConverter = ShortenedThrowableConverter()
    shortenedThrowableConverter.maxDepthPerThrowable = 30
    shortenedThrowableConverter.maxLength = 2048
    shortenedThrowableConverter.shortenedClassNameLength = 20
    shortenedThrowableConverter.excludes = ArrayList<String>()
    shortenedThrowableConverter.excludes.add("^sun\\.reflect\\..*\\.invoke")
    shortenedThrowableConverter.excludes.add("^net\\.sf\\.cglib\\.proxy\\.MethodProxy\\.invoke")
    shortenedThrowableConverter.isRootCauseFirst = true

    val stackTraceElementJsonProvider = StackTraceJsonProvider()
    stackTraceElementJsonProvider.throwableConverter = shortenedThrowableConverter

    val exception = LoggingEventNestedJsonProvider()
    exception.fieldName = "exception"
    exception.providers = JsonProviders()
    exception.providers.addProvider(stackTraceElementJsonProvider)
    exception.providers.addProvider(RootStackTraceElementJsonProvider())

    val loggingEventCompositeJsonLayout = LoggingEventCompositeJsonLayout()
    loggingEventCompositeJsonLayout.providers = JsonProviders()
    loggingEventCompositeJsonLayout.providers.addProvider(SequenceJsonProvider())
    loggingEventCompositeJsonLayout.providers.addProvider(LoggingEventFormattedTimestampJsonProvider())
    loggingEventCompositeJsonLayout.providers.addProvider(MessageJsonProvider())
    loggingEventCompositeJsonLayout.providers.addProvider(LoggerNameJsonProvider())
    loggingEventCompositeJsonLayout.providers.addProvider(LogLevelJsonProvider())
    loggingEventCompositeJsonLayout.providers.addProvider(extra)
    loggingEventCompositeJsonLayout.providers.addProvider(exception)

    return loggingEventCompositeJsonLayout
  }

  @Suppress("UNCHECKED_CAST")
  fun createLogglyAppender( logglyConfiguration: BaseLogglyConfiguration ) : LogglyAppender<ILoggingEvent> {
    val logglyAppender = LogglyAppender<ILoggingEvent>()
    logglyAppender.name = "logglyAppender"
    logglyAppender.endpointUrl = """https://logs-01.loggly.com/bulk/${logglyConfiguration.token}/tag/logback"""
    logglyAppender.layout = createLoggingEventCompositeJsonLayout()
    return logglyAppender
  }

}

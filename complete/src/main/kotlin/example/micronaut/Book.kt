package example.micronaut
import io.micronaut.core.annotation.Introspected

@Introspected // <1>
class Book {
    var name: String? = null
}
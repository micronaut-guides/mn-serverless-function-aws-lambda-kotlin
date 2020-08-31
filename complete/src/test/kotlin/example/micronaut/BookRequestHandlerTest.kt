package example.micronaut
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class BookRequestHandlerTest {

    @Test
    fun testHandler() {
        val bookRequestHandler = BookRequestHandler() // <1>
        val book = Book()
        book.name = "Building Microservices"
        val bookSaved = bookRequestHandler.execute(book) // <3>
        Assertions.assertNotNull(bookSaved)
        Assertions.assertEquals(book.name, bookSaved!!.name)
        Assertions.assertNotNull(bookSaved.isbn)
        bookRequestHandler.applicationContext.close() // <2>
    }
}
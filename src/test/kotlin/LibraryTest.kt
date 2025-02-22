import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LibraryTest {
    @Test
    fun testAddAndFindBooks() {
        val library = Library()
        val book = Book("Peter Thiel with Blake Masters", "9780753555200", isReference = true, isBorrowed = true, "Zero To One")
        library.addBook(book)

        println(listOf(book))
    }
}
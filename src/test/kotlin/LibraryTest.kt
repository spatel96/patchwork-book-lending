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

        assertEquals(listOf(book), library.findBooksByAuthor("Peter Thiel with Blake Masters"))
        assertEquals(listOf(book), library.findBooksByTitle("Zero To One")) 
        assertEquals(book, library.findBooksByIsbn("9780753555200"))            
    }

    @Test
    fun testBorrowBook() {
        val library = Library()
        val book = Book("Peter Thiel with Blake Masters", "9780753555200", isReference = false, isBorrowed = false, "Zero To One")
        library.addBook(book)

        assertTrue(library.borrowBook("9780753555200"))
        assertFalse(library.borrowBook("9780753555200"))
        assertEquals(1, library.getBorrowedBooksCount())
    }

    @Test
    fun testBorrowingReferenceBook() {
        val library = Library()
        val book = Book("Peter Thiel with Blake Masters", "9780753555200", isReference = true, isBorrowed = false, "Zero To One")
        library.addBook(book)

        assertFalse(library.borrowBook("9780753555200"))
        assertEquals(0, library.getBorrowedBooksCount())
    }
}
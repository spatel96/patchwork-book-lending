import Book

class Library {
    private val books = mutableListOf<Book>()
    private val borrowedBooks = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun getBooks(): List<Book> {
        return books
    }
}
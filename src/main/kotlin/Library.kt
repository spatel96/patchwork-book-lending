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

    fun findBooksByAuthor(author: String): List<Book> {
        return books.filter { it.author.equals(author, ignoreCase = true) }
    }

    fun findBooksByTitle(title: String): List<Book> {
        return books.filter { it.title.equals(title, ignoreCase = true) }
    }

    fun findBooksByIsbn(isbn: String): Book? {
        return books.find { it.isbn == isbn }
    }

    fun borrowBook(isbn: String): Boolean {
        val book = findBooksByIsbn(isbn)
        return if (book != null && !book.isReference && !book.isBorrowed) {
            book.isBorrowed = true
            borrowedBooks.add(book)
            true
        } else {
            false
        }
    }

    fun getBorrowedBooksCount(): Int {
        return borrowedBooks.size
    }
}
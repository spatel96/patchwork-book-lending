fun main() {
    val library = Library()

    val book1 = Book("J.R.R. Tolkien", "9780547928227", isReference = false, isBorrowed = false, "The Hobbit")
    val book2 = Book("Peter Thiel with Blake Masters", "9780753555200", isReference = true, isBorrowed = false, "Zero To One")
    val book3 = Book("Gene Kim; Jez Humble; Patrick Debois; John Willis; Nicole Forsgren", "9781950508402", isReference = true, isBorrowed = false, "The DevOps Handbook: How to Create World-Class Agility, Reliability, & Security in Technology Organizations")

    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    println("Number of books ${library.getBooks().size}")

    println("Books by J.R.R. Tolkien: ${library.findBooksByAuthor("J.R.R. Tolkien")}")
    println("Books with title 'The Hobbit': ${library.findBooksByTitle("The Hobbit")}")
    println("Book with ISBN '9780753555200': ${library.findBooksByIsbn("9780753555200")}")

    println("Borrowing 'The Hobbit': ${library.borrowBook("9780547928227")}")
    println("Borrowing 'Zero To One': ${library.borrowBook("9780753555200")}")
    println("Number of borrowed books: ${library.getBorrowedBooksCount()}")
}
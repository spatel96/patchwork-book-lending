fun main() {
    val library = Library()

    val book1 = Book("J.R.R. Tolkien", "1234567891011", isReference = false, isBorrowed = false, "The Hobbit")
    val book2 = Book("Peter Thiel with Blake Masters", "9780753555200", isReference = true, isBorrowed = true, "Zero To One")
    val book3 = Book("Gene Kim; Jez Humble; Patrick Debois; John Willis; Nicole Forsgren", "9781950508402", isReference = true, isBorrowed = true, "The DevOps Handbook: How to Create World-Class Agility, Reliability, & Security in Technology Organizations")

    library.addBook(book1)
    library.addBook(book2)

    println(library.getBooks())
}
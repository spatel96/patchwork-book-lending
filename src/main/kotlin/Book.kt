data class Book(
        
    val author: String,
    val isbn: String,
    val isReference: Boolean = false,
    var isBorrowed: Boolean = false
    val title: String,
    
)
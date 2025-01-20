// Book class to manage library books
public class Book {

    // Static variable shared across all books
    static String libraryName = "City Library";

    // Final variable for ISBN (unchangeable once assigned)
    final String isbn;

    // Instance variables for book details
    String title;
    String author;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        // Initializing title using 'this' keyword to resolve ambiguity
        this.title = title;

        // Initializing author using 'this' keyword
        this.author = author;

        // Initializing ISBN using 'this' keyword
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        // Displaying the library name
        System.out.println("Library: " + libraryName);
    }

    // Instance method to display book details
    public void displayBookDetails() {
        // Checking if the current object is an instance of the Book class
        if (this instanceof Book) {
            // Displaying book details
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    // Main method to test Book class functionality
    public static void main(String[] args) {
        // Creating a Book object for "Java Programming"
        Book book1 = new Book("Java Programming", "James Gosling", "978-0-13-516630-7");

        // Creating a Book object for "Data Structures"
        Book book2 = new Book("Data Structures", "Mark Allen Weiss", "978-0-13-214601-1");

        // Displaying details of the first book
        book1.displayBookDetails();

        // Displaying details of the second book
        book2.displayBookDetails();

        // Displaying the library name
        displayLibraryName();
    }
}


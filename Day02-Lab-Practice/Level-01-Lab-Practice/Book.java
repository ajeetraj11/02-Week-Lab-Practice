// Book class that stores details about a book
public class Book {

    // Declaring private attributes for book details
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        // Calls the parameterized constructor with default values
        this("Unknown Title", "Unknown Author", 0.0);
    }

    // Parameterized constructor to initialize book attributes
    public Book(String title, String author, double price) {
        // Assigning values using 'this' keyword
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        // Prints the book's title
        System.out.println("Title: " + title);

        // Prints the author's name
        System.out.println("Author: " + author);

        // Prints the price of the book
        System.out.println("Price: $" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Book defaultBook = new Book();
        // Creating an object using the parameterized constructor
        Book customBook = new Book("Lion King", "Ajit Raj", 9.99);

        // Displaying details of the default book
        System.out.println("=== Default Book ===");
        defaultBook.displayDetails();

        // Displaying details of the custom book
        System.out.println("\n=== Custom Book ===");
        customBook.displayDetails();
    }
}


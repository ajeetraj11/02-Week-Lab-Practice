import java.util.Scanner;

// Book Class: Represents a book with attributes title, author, and price.
class Book
{
    private String title;
    private String author;
    private double price;

    // Constructor to initialize book attributes
    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails()
    {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: $" + price);
    }

    // Main method to demonstrate the Book class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();

        // Create a Book object
        Book book = new Book(title, author, price);

        // Display book details
        book.displayDetails();

        // Close the scanner object
        scanner.close();
    }
}


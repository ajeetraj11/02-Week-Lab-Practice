// Product class that represents a product with individual details
// and tracks total products
public class Product {

    // Declaring private instance variable for product name
    private String productName;

    // Declaring private instance variable for product price
    private double price;

    // Declaring a static class variable to track total number of products created
    private static int totalProducts = 0;

    // Constructor to initialize a product with name and price
    public Product(String productName, double price) {
        // Assigning parameter values to instance variables using 'this' keyword
        this.productName = productName;
        this.price = price;

        // Incrementing the totalProducts
        totalProducts++;
    }

    // Instance method to display details of a specific product
    public void displayProductDetails() {
        // Printing the name of the product
        System.out.println("Product Name: " + productName);

        // Printing the price of the product
        System.out.println("Price: $" + price);
    }

    // Static method to display the total number of products created
    public static void displayTotalProducts() {
        // Printing the total count of products created across all instances
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating the first product instance with name and price
        Product product1 = new Product("Laptop", 1200.50);

        // Creating the second product instance with name and price
        Product product2 = new Product("Smartphone", 800.75);

        // Printing a separator for readability
        System.out.println("=== Product 1 Details ===");

        // Displaying details of the first product
        product1.displayProductDetails();

        // Printing a separator for readability
        System.out.println("\n=== Product 2 Details ===");

        // Displaying details of the second product
        product2.displayProductDetails();

        // Printing a separator for readability
        System.out.println("\n=== Total Products ===");

        // Displaying the total number of products created
        Product.displayTotalProducts();
    }
}


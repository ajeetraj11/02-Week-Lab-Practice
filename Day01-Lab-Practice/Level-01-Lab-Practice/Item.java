
import java.util.Scanner;

// Item Class: Represents an item with attributes itemCode, itemName, and price.
class Item
{
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize item attributes
    public Item(String itemCode, String itemName, double price)
    {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails()
    {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: $" + price);
    }

    // Method to calculate total cost based on quantity
    public double calculateTotalCost(int quantity)
    {
        return price * quantity;
    }

    // Main method to demonstrate the Item class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter item code: ");
        String itemCode = scanner.nextLine();

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Create an Item object
        Item item = new Item(itemCode, itemName, price);

        // Display item details
        item.displayItemDetails();

        // Calculate and display total cost
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " items: $" + totalCost);

        // Close the scanner object
        scanner.close();
    }
}


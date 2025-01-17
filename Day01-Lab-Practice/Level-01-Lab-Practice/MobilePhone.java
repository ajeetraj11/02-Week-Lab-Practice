import java.util.Scanner;

// MobilePhone Class: Represents a mobile phone with attributes brand, model, and price.
class MobilePhone
{
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize mobile phone attributes
    public MobilePhone(String brand, String model, double price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayPhoneDetails()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to demonstrate the MobilePhone class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter mobile phone brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter mobile phone model: ");
        String model = scanner.nextLine();

        System.out.print("Enter mobile phone price: ");
        double price = scanner.nextDouble();

        // Create a MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Display phone details
        phone.displayPhoneDetails();

        // Close the scanner object
        scanner.close();
    }
}


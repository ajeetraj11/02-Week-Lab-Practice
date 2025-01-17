import java.util.Scanner;

// Circle Class: Represents a circle with a radius attribute.
class Circle
{
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius)
    {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference()
    {
        return 2 * Math.PI * radius;
    }

    // Method to display the details of the circle
    public void displayDetails()
    {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main method to demonstrate the Circle class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create a Circle object
        Circle circle = new Circle(radius);

        // Display circle details
        circle.displayDetails();

        // Close the scanner object
        scanner.close();
    }
}


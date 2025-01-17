import java.util.Scanner;

// Employee Class: Represents an employee with attributes name, ID, and salary.
class Employee
{
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize employee attributes
    public Employee(String name, int id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }

    // Main method to demonstrate the Employee class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(name, id, salary);

        // Display employee details
        employee.displayDetails();

        // Close the scanner object
        scanner.close();
    }
}


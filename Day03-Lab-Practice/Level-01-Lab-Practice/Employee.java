// Employee class to manage employee details
public class Employee {

    // Static variable shared across all employees
    static String companyName = "Tech Solutions";

    // Final variable for employee ID (unchangeable once assigned)
    final int id;

    // Instance variables for employee details
    String name;
    String designation;

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation) {
        // Initializing name using 'this' keyword to resolve ambiguity
        this.name = name;

        // Initializing id using 'this' keyword
        this.id = id;

        // Initializing designation using 'this' keyword
        this.designation = designation;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        // Displaying the total number of employees (company-specific)
        System.out.println("Total Employees in " + companyName);
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        // Checking if the current object is an instance of the Employee class
        if (this instanceof Employee) {
            // Displaying employee details
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    // Main method to test Employee class functionality
    public static void main(String[] args) {
        // Creating an Employee object for John
        Employee emp1 = new Employee("Ajeet Raj", 11, "Software Engineer");

        // Creating an Employee object for Alice
        Employee emp2 = new Employee("Amit Raj", 12, "HR Manager");

        // Displaying details of the first employee
        emp1.displayEmployeeDetails();

        // Displaying details of the second employee
        emp2.displayEmployeeDetails();

        // Displaying the total number of employees
        displayTotalEmployees();
    }
}


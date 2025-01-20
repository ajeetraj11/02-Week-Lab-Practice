// Employee class representing employee details with different access modifiers
class Employee {

    // Public attribute: Accessible from anywhere
    public int employeeID;

    // Protected attribute: Accessible within the same package and subclasses
    protected String department;

    // Private attribute: Accessible only within this class
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        // Assigning employeeID to the instance variable
        this.employeeID = employeeID;

        // Assigning department to the instance variable
        this.department = department;

        // Assigning salary to the instance variable
        this.salary = salary;
    }

    // Public method to set the salary
    public void setSalary(double salary) {
        // Updating the salary attribute
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        // Returning the salary attribute
        return salary;
    }

    // Public method to display employee details
    public void displayEmployeeDetails() {
        // Printing the employee ID
        System.out.println("Employee ID: " + employeeID);

        // Printing the department
        System.out.println("Department: " + department);

        // Printing the salary
        System.out.println("Salary: " + salary);
    }
}

// Manager class inheriting from Employee to demonstrate protected and public access
class Manager extends Employee {

    // Constructor for Manager class calling the Employee superclass constructor
    public Manager(int employeeID, String department, double salary) {
        // Passing parameters to the parent class constructor
        super(employeeID, department, salary);
    }

    // Method to display manager-specific details
    public void displayManagerDetails() {
        // Accessing and printing the public employeeID
        System.out.println("Manager ID: " + employeeID);

        // Accessing and printing the protected department
        System.out.println("Manager Department: " + department);
    }
}

// Main class to test Employee and Manager classes
 class EmployeeRecords {

    public static void main(String[] args) {
        // Creating an Employee object with employeeID, department, and salary
        Employee employee = new Employee(101, "HR", 45000.0);

        // Displaying the employee details
        employee.displayEmployeeDetails();

        // Updating the salary using the public setter method
        employee.setSalary(50000.0);

        // Printing the updated salary using the public getter method
        System.out.println("Updated Salary: " + employee.getSalary());

        // Creating a Manager object with employeeID, department, and salary
        Manager manager = new Manager(201, "Operations", 75000.0);

        // Displaying the manager details
        manager.displayManagerDetails();

        // Updating and displaying the salary for the manager
        manager.setSalary(80000.0);
        System.out.println("Updated Manager Salary: " + manager.getSalary());
    }
}


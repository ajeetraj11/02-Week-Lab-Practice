package com.employeemanagementsystem;

// Declaring the main class EmployeeManagementSystem to test the implementation
public class EmployeeManagementSystem {

     // Main method to execute the program
     public static void main(String[] args) {

          // Creating a full-time employee object with ID, name, and base salary
          FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(111, "Ajeet", 55000);

          // Assigning the department to the full-time employee
          fullTimeEmployee.assignDepartment("Software Development");

          // Displaying the full-time employee details
          System.out.println("Full-Time Employee Details:");
          fullTimeEmployee.displayDetails();

          // Printing the department of the full-time employee
          System.out.println(fullTimeEmployee.getDepartmentDetails());

          // Printing the calculated salary of the full-time employee
          System.out.println("Salary: $" + fullTimeEmployee.calculateSalary());

          // Creating a part-time employee object with ID, name, hourly rate, and hours worked
          PartTimeEmployee partTimeEmployee = new PartTimeEmployee(112, "Abhishek", 25, 125);

          // Assigning the department to the part-time employee
          partTimeEmployee.assignDepartment("Technical Support");

          // Displaying the part-time employee details
          System.out.println("\nPart-Time Employee Details:");
          partTimeEmployee.displayDetails();

          // Printing the department of the part-time employee
          System.out.println(partTimeEmployee.getDepartmentDetails());

          // Printing the calculated salary of the part-time employee
          System.out.println("Salary: $" + partTimeEmployee.calculateSalary());
     }
}


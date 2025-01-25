package com.employeemanagementsystem;

// Defining the superclass Employee
public class Employee {
     // Declaring the employee's name
     protected String name;

     // Declaring the employee's ID
     protected int id;

     // Declaring the employee's salary
     protected double salary;

     // Constructor to initialize Employee object
     public Employee(String name, int id, double salary) {
          this.name = name;
          this.id = id;
          this.salary = salary;
     }

     // Method to display employee details
     public void displayDetails() {
          System.out.println("Employee Name: " + name);
          System.out.println("Employee ID: " + id);
          System.out.println("Salary: $" + salary);
     }
}

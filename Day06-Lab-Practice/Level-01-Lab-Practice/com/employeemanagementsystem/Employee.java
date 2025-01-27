package com.employeemanagementsystem;

// Declaring an abstract class Employee to represent a general employee
abstract class Employee {

     // Declaring a private field to store the employee ID
     private int employeeId;

     // Declaring a private field to store the employee's name
     private String name;

     // Declaring a private field to store the base salary of the employee
     private double baseSalary;

     // Constructor to initialize the employee details with employeeId, name, and baseSalary
     public Employee(int employeeId, String name, double baseSalary) {

          // Assigning the employeeId to the instance variable
          this.employeeId = employeeId;

          // Assigning the name to the instance variable
          this.name = name;

          // Assigning the baseSalary to the instance variable
          this.baseSalary = baseSalary;
     }

     // Getter method to retrieve the employee ID
     public int getEmployeeId() {

          // Returning the employee ID
          return employeeId;
     }

     // Getter method to retrieve the employee name
     public String getName() {

          // Returning the employee name
          return name;
     }

     // Getter method to retrieve the base salary
     public double getBaseSalary() {

          // Returning the base salary
          return baseSalary;
     }

     // Declaring an abstract method to calculate the salary of the employee
     public abstract double calculateSalary();

     // Method to display employee details
     public void displayDetails() {

          // Printing the employee ID
          System.out.println("Employee ID: " + employeeId);

          // Printing the employee name
          System.out.println("Name: " + name);

          // Printing the base salary
          System.out.println("Base Salary: $" + baseSalary);
     }
}

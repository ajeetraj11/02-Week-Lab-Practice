package com.employeemanagementsystem;

// Defining a subclass PartTimeEmployee that extends Employee and implements Department interface
public class PartTimeEmployee extends Employee implements Department {

     // Declaring a private field to store the hourly rate of the employee
     private double hourlyRate;

     // Declaring a private field to store the number of hours worked
     private int hoursWorked;

     // Declaring a private field to store the department name
     private String department;

     // Constructor to initialize part-time employee details
     public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {

          // Calling the constructor of the superclass Employee with a base salary of 0
          super(employeeId, name, 0);

          // Assigning the hourly rate to the instance variable
          this.hourlyRate = hourlyRate;

          // Assigning the number of hours worked to the instance variable
          this.hoursWorked = hoursWorked;
     }

     // Overriding the abstract method calculateSalary for part-time employees
     @Override
     public double calculateSalary() {

          // Calculating the salary as hourly rate multiplied by hours worked
          return hourlyRate * hoursWorked;
     }

     // Overriding the method to assign a department to the part-time employee
     @Override
     public void assignDepartment(String departmentName) {

          // Assigning the department name to the instance variable
          this.department = departmentName;
     }

     // Overriding the method to retrieve department details
     @Override
     public String getDepartmentDetails() {

          // Returning the department name
          return "Department: " + department;
     }
}


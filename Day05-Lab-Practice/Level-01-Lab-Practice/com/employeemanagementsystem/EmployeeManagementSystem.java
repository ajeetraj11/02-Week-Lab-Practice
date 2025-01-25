package com.employeemanagementsystem;

// Main class to demonstrate the Employee hierarchy
public class EmployeeManagementSystem {
     public static void main(String[] args) {
          // Creating an object of Manager class
          Manager manager = new Manager("Ajeet", 101, 80000, 10);

          // Creating an object of Developer class
          Developer developer = new Developer("Vishal", 102, 65000, "Java");

          // Creating an object of Intern class
          Intern intern = new Intern("Raj", 103, 27000, 6);

          // Displaying Manager details
          System.out.println("\nManager Details:");
          manager.displayDetails();

          // Displaying Developer details
          System.out.println("\nDeveloper Details:");
          developer.displayDetails();

          // Displaying Intern details
          System.out.println("\nIntern Details:");
          intern.displayDetails();
     }
}


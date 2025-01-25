package com.schoolsystemhierarchy;

// Subclass representing a Staff
class Staff extends Person {
     // Declaring specific attribute for Staff
     private String department;

     // Constructor to initialize Staff object
     public Staff(String name, int age, String department) {
          super(name, age); // Calling the superclass constructor
          this.department = department;
     }

     // Method to display role specific to Staff
     @Override
     public void displayRole() {
          System.out.println("Role: Staff");
     }

     // Method to display the department of the staff member
     public void displayDepartment() {
          System.out.println("Department: " + department);
     }
}

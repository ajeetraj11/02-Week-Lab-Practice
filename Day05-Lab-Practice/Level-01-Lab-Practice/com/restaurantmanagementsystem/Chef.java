package com.restaurantmanagementsystem;

// Subclass representing a Chef
public class Chef extends Person implements Worker {
     // Declaring specific attribute for Chef
     private String specialty;

     // Constructor to initialize Chef object
     public Chef(String name, int id, String specialty) {
          super(name, id);
          this.specialty = specialty;
     }

     // Method to display details of the chef
     @Override
     public void displayDetails() {
          super.displayDetails(); // Calling the superclass method
          System.out.println("Specialty: " + specialty);
     }

     // Implementation of performDuties() specific to a chef
     @Override
     public void performDuties() {
          System.out.println(name + " is preparing dishes, specializing in " + specialty + ".");
     }
}


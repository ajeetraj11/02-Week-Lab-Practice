package com.restaurantmanagementsystem;

// Subclass representing a Waiter
public class Waiter extends Person implements Worker {
     // Declaring specific attribute for Waiter
     private String section;

     // Constructor to initialize Waiter object
     public Waiter(String name, int id, String section) {
          super(name, id);
          this.section = section;
     }

     // Method to display details of the waiter
     @Override
     public void displayDetails() {
          super.displayDetails();
          System.out.println("Section: " + section);
     }

     // Implementation of performDuties() specific to a waiter
     @Override
     public void performDuties() {
          System.out.println(name + " is serving customers in the " + section + " section.");
     }
}

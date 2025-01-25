package com.restaurantmanagementsystem;

// Main class to demonstrate hybrid inheritance in a restaurant system
public class RestaurantManagementSystem {
     public static void main(String[] args) {
          // Creating a Chef object and displaying its details
          Chef chef = new Chef("Ajeet", 101, "Italian Cuisine");
          System.out.println("Chef Details:");
          chef.displayDetails();
          chef.performDuties();
          System.out.println();

          // Creating a Waiter object and displaying its details
          Waiter waiter = new Waiter("Ankit", 201, "Outdoor");
          System.out.println("Waiter Details:");
          waiter.displayDetails();
          waiter.performDuties();
     }
}


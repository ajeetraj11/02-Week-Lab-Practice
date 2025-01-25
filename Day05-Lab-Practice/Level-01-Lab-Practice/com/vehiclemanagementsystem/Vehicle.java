package com.vehiclemanagementsystem;

// Superclass representing a generic Vehicle
class Vehicle {
     // Declaring common attributes for all vehicles
     protected int maxSpeed;
     protected String model;

     // Constructor to initialize a Vehicle object
     public Vehicle(int maxSpeed, String model) {
          this.maxSpeed = maxSpeed;
          this.model = model;
     }

     // Method to display details of the vehicle
     public void displayDetails() {
          System.out.println("Model: " + model);
          System.out.println("Max Speed: " + maxSpeed + " km/h");
     }
}


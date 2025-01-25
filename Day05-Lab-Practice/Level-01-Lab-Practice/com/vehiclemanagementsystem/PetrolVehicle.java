package com.vehiclemanagementsystem;

// Subclass representing a Petrol Vehicle that implements Refuelable
public class PetrolVehicle extends Vehicle implements Refuelable {
     // Declaring specific attribute for PetrolVehicle
     private int fuelCapacity;

     // Constructor to initialize a PetrolVehicle object
     public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
          super(maxSpeed, model); // Calling the superclass constructor
          this.fuelCapacity = fuelCapacity;
     }

     // Method to display details of the petrol vehicle
     @Override
     public void displayDetails() {
          super.displayDetails(); // Calling the superclass method
          System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
     }

     // Implementation of the refuel() method from the Refuelable interface
     @Override
     public void refuel() {
          System.out.println("Refueling the " + model + " with " + fuelCapacity + " liters of fuel.");
     }
}


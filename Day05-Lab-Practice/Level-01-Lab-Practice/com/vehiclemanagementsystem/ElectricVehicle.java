package com.vehiclemanagementsystem;

// Subclass representing an Electric Vehicle
public class ElectricVehicle extends Vehicle {
     // Declaring specific attribute for ElectricVehicle
     private int batteryCapacity;

     // Constructor to initialize an ElectricVehicle object
     public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
          super(maxSpeed, model); // Calling the superclass constructor
          this.batteryCapacity = batteryCapacity;
     }

     // Method to display details of the electric vehicle
     @Override
     public void displayDetails() {
          super.displayDetails(); // Calling the superclass method
          System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
     }

     // Method specific to ElectricVehicle for charging
     public void charge() {
          System.out.println("Charging the " + model + " with a " + batteryCapacity + " kWh battery.");
     }
}

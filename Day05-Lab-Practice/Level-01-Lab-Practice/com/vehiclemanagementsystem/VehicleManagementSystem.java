package com.vehiclemanagementsystem;


// Main class to demonstrate hybrid inheritance in a vehicle system
public class VehicleManagementSystem {
     public static void main(String[] args) {
          // Creating an ElectricVehicle object and displaying its details
          ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
          System.out.println("Electric Vehicle Details:");
          ev.displayDetails();
          ev.charge();
          System.out.println();

          // Creating a PetrolVehicle object and displaying its details
          PetrolVehicle pv = new PetrolVehicle(180, "Toyota Corolla", 50);
          System.out.println("Petrol Vehicle Details:");
          pv.displayDetails();
          pv.refuel();
     }
}


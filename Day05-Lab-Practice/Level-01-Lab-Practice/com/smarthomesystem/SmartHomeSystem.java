package com.smarthomesystem;

// Main class to demonstrate Single Inheritance
public class SmartHomeSystem {
     public static void main(String[] args) {
          // Creating a Thermostat object with device details
          Thermostat smartThermostat = new Thermostat("TH111", true, 28);

          // Displaying the details of the thermostat
          smartThermostat.displayStatus();
     }
}


package com.hospitalpatientmanagement;

// Main class to test the hospital patient management system
public class HospitalPatientManagement {

     // Main method to execute the program
     public static void main(String[] args) {

          // Create an in-patient object with details: ID, name, age, hospitalization days, and daily charge
          InPatient inPatient = new InPatient(101, "Ajeet", 25, 7, 250);

          // Create an out-patient object with details: ID, name, age, and consultation fee
          OutPatient outPatient = new OutPatient(102, "Amit", 18, 100);

          // Display details of the in-patient
          System.out.println("In-Patient Details:");
          inPatient.getPatientDetails();
          // Print the medical records for the in-patient
          System.out.println("Medical Records: " + inPatient.viewRecords());
          // Print the calculated bill for the in-patient
          System.out.println("Total Bill: $" + inPatient.calculateBill());

          // Display details of the out-patient
          System.out.println("\nOut-Patient Details:");
          outPatient.getPatientDetails();
          // Print the medical records for the out-patient
          System.out.println("Medical Records: " + outPatient.viewRecords());
          // Print the calculated bill for the out-patient
          System.out.println("Total Bill: $" + outPatient.calculateBill());

          // Add some medical records for the in-patient
          inPatient.addRecord("Diagnosed with Flu.");
          inPatient.addRecord("Prescribed Medication: FluMed.");

          // Add some medical records for the out-patient
          outPatient.addRecord("Consulted for regular check-up.");
     }
}


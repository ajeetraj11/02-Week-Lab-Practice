package com.hospitalpatientmanagement;

// Class representing an out-patient, extending Patient and implementing MedicalRecord interface
public class OutPatient extends Patient implements MedicalRecord {

     // Field to store the consultation fee for the out-patient
     private double consultationFee;

     // Field to store the list of medical records for the out-patient
     private StringBuilder medicalRecords = new StringBuilder();

     // Constructor to initialize out-patient details
     public OutPatient(int patientId, String name, int age, double consultationFee) {
          // Call the parent constructor to initialize the patient details
          super(patientId, name, age);

          // Assign consultation fee to the instance variable
          this.consultationFee = consultationFee;
     }

     // Implement the method to calculate the total bill for the out-patient
     @Override
     public double calculateBill() {
          // Return the consultation fee as the total bill for the out-patient
          return consultationFee;
     }

     // Implement the method to add medical records for the out-patient
     @Override
     public void addRecord(String record) {
          // Append the new medical record to the list of medical records
          medicalRecords.append(record).append("\n");
     }

     // Implement the method to view medical records for the out-patient
     @Override
     public String viewRecords() {
          // Return the list of medical records as a string
          return medicalRecords.toString();
     }
}

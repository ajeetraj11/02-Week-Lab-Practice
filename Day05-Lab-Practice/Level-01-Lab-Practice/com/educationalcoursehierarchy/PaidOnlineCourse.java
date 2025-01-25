package com.educationalcoursehierarchy;

// Defining the subclass PaidOnlineCourse that extends OnlineCourse
public class PaidOnlineCourse extends OnlineCourse {
     // Declaring the course fee
     private double fee;

     // Declaring the discount percentage
     private double discount; // in percentage

     // Constructor to initialize PaidOnlineCourse object
     public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
          // Calling the superclass constructor to set courseName, duration, platform, and isRecorded
          super(courseName, duration, platform, isRecorded);
          this.fee = fee;
          this.discount = discount;
     }

     // Method to calculate the final fee after discount
     public double calculateFinalFee() {
          return fee - (fee * discount / 100);
     }

     // Overriding the displayCourseDetails method to include payment-specific details
     @Override
     public void displayCourseDetails() {
          // Calling the superclass method to display online course details
          super.displayCourseDetails();
          System.out.println("Fee: $" + fee);
          System.out.println("Discount: " + discount + "%");
          System.out.println("Final Fee after Discount: $" + calculateFinalFee());
     }
}


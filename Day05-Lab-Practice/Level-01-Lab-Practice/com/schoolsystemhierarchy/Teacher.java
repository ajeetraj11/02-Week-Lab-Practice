package com.schoolsystemhierarchy;

// Subclass representing a Teacher
public class Teacher extends Person {
     // Declaring specific attribute for Teacher
     private String subject;

     // Constructor to initialize Teacher object
     public Teacher(String name, int age, String subject) {
          super(name, age); // Calling the superclass constructor
          this.subject = subject;
     }

     // Method to display role specific to Teacher
     @Override
     public void displayRole() {
          System.out.println("Role: Teacher");
     }

     // Method to display the subject taught by the teacher
     public void displaySubject() {
          System.out.println("Subject: " + subject);
     }
}

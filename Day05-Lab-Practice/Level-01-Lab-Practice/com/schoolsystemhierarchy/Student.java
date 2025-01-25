package com.schoolsystemhierarchy;

// Subclass representing a Student
class Student extends Person {
     // Declaring specific attribute for Student
     private String grade;

     // Constructor to initialize Student object
     public Student(String name, int age, String grade) {
          super(name, age); // Calling the superclass constructor
          this.grade = grade;
     }

     // Method to display role specific to Student
     @Override
     public void displayRole() {
          System.out.println("Role: Student");
     }

     // Method to display the grade of the student
     public void displayGrade() {
          System.out.println("Grade: " + grade);
     }
}


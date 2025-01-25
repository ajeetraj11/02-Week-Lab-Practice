package com.educationalcoursehierarchy;

// Defining the base class Course
public class Course {
     // Declaring the course name
     protected String courseName;

     // Declaring the course duration
     protected int duration;

     // Constructor to initialize Course object
     public Course(String courseName, int duration) {
          this.courseName = courseName;
          this.duration = duration;
     }

     // Method to display basic course details
     public void displayCourseDetails() {
          System.out.println("Course Name: " + courseName);
          System.out.println("Duration: " + duration + " weeks");
     }
}

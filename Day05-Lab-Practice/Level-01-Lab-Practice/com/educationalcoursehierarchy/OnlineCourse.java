package com.educationalcoursehierarchy;

// Defining the subclass OnlineCourse that extends Course
public class OnlineCourse extends Course {
     // Declaring the platform name
     protected String platform;

     // Declaring if the course is recorded
     protected boolean isRecorded;

     // Constructor to initialize OnlineCourse object
     public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
          // Calling the superclass constructor to set courseName and duration
          super(courseName, duration);
          this.platform = platform;
          this.isRecorded = isRecorded;
     }

     // Overriding the displayCourseDetails method to include online-specific details
     @Override
     public void displayCourseDetails() {
          // Calling the superclass method to display basic course details
          super.displayCourseDetails();
          System.out.println("Platform: " + platform);
          System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
     }
}

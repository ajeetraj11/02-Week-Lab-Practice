package com.educationalcoursehierarchy;

// Main class to demonstrate Multilevel Inheritance
public class EducationalCourseHierarchy {
     public static void main(String[] args) {
          // Creating an object for the base class Course
          Course course = new Course("Basic Java", 6);
          System.out.println("Base Class (Course):");
          course.displayCourseDetails();
          System.out.println();

          // Creating an object for the subclass OnlineCourse
          OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 8, "Udemy", true);
          System.out.println("Subclass (OnlineCourse):");
          onlineCourse.displayCourseDetails();
          System.out.println();

          // Creating an object for the subclass PaidOnlineCourse
          PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Spring Framework", 10, "Coursera", true, 200, 20);
          System.out.println("Subclass (PaidOnlineCourse):");
          paidOnlineCourse.displayCourseDetails();
     }
}


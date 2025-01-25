package com.schoolsystemhierarchy;

// Main class to demonstrate hierarchical inheritance in the school system
public class SchoolSystemHierarchy {
     public static void main(String[] args) {
          // Creating a Teacher object and displaying its details
          Teacher teacher = new Teacher("Ajeet", 24, "Mathematics");
          System.out.println("Teacher Details:");
          teacher.displayDetails();
          teacher.displayRole();
          teacher.displaySubject();
          System.out.println();

          // Creating a Student object and displaying its details
          Student student = new Student("Amit", 16, "10th Grade");
          System.out.println("Student Details:");
          student.displayDetails();
          student.displayRole();
          student.displayGrade();
          System.out.println();

          // Creating a Staff object and displaying its details
          Staff staff = new Staff("Vishal", 40, "Administration");
          System.out.println("Staff Details:");
          staff.displayDetails();
          staff.displayRole();
          staff.displayDepartment();
     }
}


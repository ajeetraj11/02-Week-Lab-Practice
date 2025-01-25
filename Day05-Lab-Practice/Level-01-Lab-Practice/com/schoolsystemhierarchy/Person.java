package com.schoolsystemhierarchy;

// Base class representing a generic person in the school system
public class Person {
     // Declaring common attributes for all roles
     protected String name;
     protected int age;

     // Constructor to initialize Person object
     public Person(String name, int age) {
          this.name = name;
          this.age = age;
     }

     // Method to display basic details of the person
     public void displayDetails() {
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
     }

     // Method to display the role (to be overridden in subclasses)
     public void displayRole() {
          System.out.println("Role: General Person");
     }
}

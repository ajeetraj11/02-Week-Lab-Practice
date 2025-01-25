package com.restaurantmanagementsystem;

// Superclass representing a general person in the restaurant
public class Person {
     // Declaring common attributes for all persons
     protected String name;
     protected int id;

     // Constructor to initialize a Person object
     public Person(String name, int id) {
          this.name = name;
          this.id = id;
     }

     // Method to display basic details of the person
     public void displayDetails() {
          System.out.println("Name: " + name);
          System.out.println("ID: " + id);
     }
}


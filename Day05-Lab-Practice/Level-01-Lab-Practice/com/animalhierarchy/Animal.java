package com.animalhierarchy;

// Defining the superclass Animal
public class Animal {
    // Declaring the name of the animal
    protected String name;

    // Declaring the age of the animal
    protected int age;

    // Constructor to initialize the Animal object
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses for specific sounds
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Method to display details of the animal
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}








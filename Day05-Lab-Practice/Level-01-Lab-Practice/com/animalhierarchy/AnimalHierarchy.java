package com.animalhierarchy;

// Main class to demonstrate inheritance and polymorphism
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Rocky", 5);

        // Creating an object of Cat class
        Cat cat = new Cat("Kitty", 3);

        // Creating an object of Bird class
        Bird bird = new Bird("Kiwi", 2);

        // Displaying Dog details
        dog.displayDetails();

        // Calling Dog's makeSound method
        dog.makeSound();

        // Displaying Cat details
        cat.displayDetails();

        // Calling Cat's makeSound method
        cat.makeSound();

        // Displaying Bird details
        bird.displayDetails();

        // Calling Bird's makeSound method
        bird.makeSound();
    }
}


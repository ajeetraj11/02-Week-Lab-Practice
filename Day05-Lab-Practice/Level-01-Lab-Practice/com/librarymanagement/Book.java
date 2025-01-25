package com.librarymanagement;

// Defining the superclass Book
public class Book {
     // Declaring the title of the book
     protected String title;

     // Declaring the publication year of the book
     protected int publicationYear;

     // Constructor to initialize Book object
     public Book(String title, int publicationYear) {
          this.title = title;
          this.publicationYear = publicationYear;
     }

     // Method to display book details
     public void displayInfo() {
          System.out.println("Book Title: " + title);
          System.out.println("Publication Year: " + publicationYear);
     }
}


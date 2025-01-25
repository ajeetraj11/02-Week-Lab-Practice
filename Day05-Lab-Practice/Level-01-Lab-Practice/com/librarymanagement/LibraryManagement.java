package com.librarymanagement;

// Main class to demonstrate Single Inheritance
public class LibraryManagement {
     public static void main(String[] args) {
          // Creating an Author object with book details
          Author authorBook = new Author("Harry Potter and the Chamber of Secrets", 1998, "J.K. Rowling", "Harry, Ron, and Hermione's friendship plays a crucial role in solving the mystery.");

          // Displaying the details of the book along with the author
          authorBook.displayInfo();
     }
}


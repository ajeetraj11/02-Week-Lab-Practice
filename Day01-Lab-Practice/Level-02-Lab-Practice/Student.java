import java.util.Scanner;

// Student Class: Represents a student with name, roll number, and marks attributes.
class Student
{
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize student attributes
    public Student(String name, int rollNumber, double marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on marks
    public String calculateGrade()
    {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // Main method to demonstrate the Student class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        // Create a Student object
        Student student = new Student(name, rollNumber, marks);

        // Display student details and grade
        student.displayDetails();

        // Close the scanner object
        scanner.close();
    }
}


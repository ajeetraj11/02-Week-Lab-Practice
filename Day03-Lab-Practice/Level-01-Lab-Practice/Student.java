// Student class to manage student data
public class Student {
    // Static variable to count total number of students
    static int totalNumberStudent = 0;

    // Static variable shared across all students
    static String universityName = "Global University";

    // Final variable for roll number (unchangeable)
    final int rollNumber;

    // Instance variables for student details
    String name;
    double grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double grade) {
        // Initializing name using 'this' keyword
        this.name = name;

        // Initializing roll number using 'this' keyword
        this.rollNumber = rollNumber;

        // Initializing grade using 'this' keyword
        this.grade = grade;

        // Increment the Number of student  
        totalNumberStudent++;
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        // Displaying total number of students in the university
        System.out.println("Total Students in " + universityName +" is " + totalNumberStudent);
    }

    // Instance method to display student details
    public void displayStudentDetails() {
        // Checking if the current object is an instance of the Student class
        if (this instanceof Student) {
            // Displaying university name
            System.out.println("University: " + universityName);

            // Displaying student's name
            System.out.println("Student Name: " + name);

            // Displaying student's roll number
            System.out.println("Roll Number: " + rollNumber);

            // Displaying student's grade
            System.out.println("Grade: " + grade);
        }
    }

    // Main method to test Student class functionality
    public static void main(String[] args) {
        // Creating student1 object and initializing details
        Student student1 = new Student("Ajeet Raj", 11, 95.5);

        // Creating student2 object and initializing details
        Student student2 = new Student("Amit Raj", 12, 90.0);

        // Displaying details of student1
        student1.displayStudentDetails();

        // Displaying details of student2
        student2.displayStudentDetails();

        // Displaying total number of students
        displayTotalStudents();
    }
}

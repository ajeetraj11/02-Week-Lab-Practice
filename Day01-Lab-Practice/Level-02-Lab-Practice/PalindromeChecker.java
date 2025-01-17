import java.util.Scanner;

// PalindromeChecker Class: Represents a text and checks if it is a palindrome.
class PalindromeChecker
{
    private String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text)
    {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome()
    {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }

    // Method to display the palindrome result
    public void displayResult()
    {
        if (isPalindrome()) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }

    // Main method to demonstrate the PalindromeChecker class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter text to check for palindrome: ");
        String text = scanner.nextLine();

        // Create a PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(text);

        // Display palindrome result
        checker.displayResult();

        // Close the scanner object
        scanner.close();
    }
}


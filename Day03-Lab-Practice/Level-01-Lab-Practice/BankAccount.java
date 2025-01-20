// BankAccount class to manage account details
public class BankAccount {

    // Static variable shared across all bank accounts
    static String bankName = "Global Bank";

    // Final variable for account number
    final int accountNumber;

    // Instance variables for account holder's details
    String accountHolderName;
    double balance;

    // Static variable to keep track of total number of accounts
    static int totalAccounts = 0;
    // Constructor to initialize account details
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        // Initializing account holder's name using 'this' keyword to resolve ambiguity
        this.accountHolderName = accountHolderName;

        // Initializing account number using 'this' keyword
        this.accountNumber = accountNumber;

        // Initializing balance using 'this' keyword
        this.balance = balance;

        // Increment total accounts every time a new account is created
        totalAccounts++;
    }

    // Static method to display the total number of accounts
    public static void getTotalAccounts() {
        // Displaying the total number of bank accounts created
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    // Instance method to check and modify the balance
    public void modifyBalance(double amount) {
        // Adding amount to the balance
        balance += amount;
    }

    // Instance method to display account details
    public void displayAccountDetails() {
        // Checking if the current object is an instance of the BankAccount class
        if (this instanceof BankAccount) {
            // Displaying bank details
            System.out.println("Bank: " + bankName);

            // Displaying account holder's name
            System.out.println("Account Holder: " + accountHolderName);

            // Displaying account number
            System.out.println("Account Number: " + accountNumber);

            // Displaying balance
            System.out.println("Balance: " + balance);
        }
    }

    // Main method to test BankAccount class functionality
    public static void main(String[] args) {
        // Creating a bank account object for John
        BankAccount account1 = new BankAccount("Ajeet Raj", 11, 1500.0);

        // Creating a bank account object for Alice
        BankAccount account2 = new BankAccount("Virat Kohli", 12, 2000.0);

        // Displaying details of the first account
        account1.displayAccountDetails();

        // Displaying details of the second account
        account2.displayAccountDetails();

        // Modifying the balance of account1 by adding 500
        account1.modifyBalance(500.0);

        // Displaying details of account1 after balance modification
        account1.displayAccountDetails();

        // Displaying the total number of bank accounts created
        getTotalAccounts();
    }
}


// BankAccount class representing a bank account with different access modifiers
class BankAccount {

    // Public attribute: Accessible from anywhere
    public long accountNumber;

    // Protected attribute: Accessible within the same package and subclasses
    protected String accountHolder;

    // Private attribute: Accessible only within this class
    private double balance;

    // Constructor to initialize bank account details
    public BankAccount(long accountNumber, String accountHolder, double balance) {
        // Assigning values to instance variables
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        // Adding the deposit amount to the balance
        balance += amount;
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        // Checking if sufficient balance is available
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Public method to get the balance
    public double getBalance() {
        // Returning the balance amount
        return balance;
    }
}

// Subclass of BankAccount demonstrating protected and public access
class SavingsAccount extends BankAccount {

    // Constructor for SavingsAccount calling the superclass constructor
    public SavingsAccount(long accountNumber, String accountHolder, double balance) {
        // Calling parent class constructor to initialize attributes
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    public void displayAccountDetails() {
        // Accessing public accountNumber and protected accountHolder
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

// Main class to test BankAccount and SavingsAccount
class BankSystem {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount account = new SavingsAccount(123456789, "Ajeet raj", 5000.0);

        // Displaying account details
        account.displayAccountDetails();

        // Depositing money
        account.deposit(1500.0);

        // Printing the updated balance
        System.out.println("Updated Balance: $" + account.getBalance());
    }
}


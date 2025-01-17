import java.util.Scanner;

// BankAccount Class: Represents a bank account with attributes account holder, account number, and balance.
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor to initialize account attributes
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method to demonstrate the BankAccount class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter Deposited Amount: ");
        double depositAmount = scanner.nextDouble();

        System.out.print("Enter Withdrawn Amount: ");
        double withdrawAmount = scanner.nextDouble();

        // Create a BankAccount object
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        // Deposit, withdraw, and display balance
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);
        account.displayBalance();

        // Close the scanner object
        scanner.close();
    }
}


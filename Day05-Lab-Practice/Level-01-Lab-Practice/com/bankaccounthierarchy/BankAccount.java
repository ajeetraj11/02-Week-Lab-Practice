package com.bankaccounthierarchy;

// Base class representing a generic bank account
public class BankAccount {
     // Declaring account number
     protected String accountNumber;

     // Declaring balance
     protected double balance;

     // Constructor to initialize BankAccount object
     public BankAccount(String accountNumber, double balance) {
          this.accountNumber = accountNumber;
          this.balance = balance;
     }

     // Method to display basic account details
     public void displayAccountDetails() {
          System.out.println("Account Number: " + accountNumber);
          System.out.println("Balance: $" + balance);
     }

     // Method to display account type (to be overridden in subclasses)
     public void displayAccountType() {
          System.out.println("General Bank Account");
     }
}

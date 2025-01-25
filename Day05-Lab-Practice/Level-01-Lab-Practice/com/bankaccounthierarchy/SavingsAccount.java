package com.bankaccounthierarchy;

// Subclass representing a savings account
public class SavingsAccount extends BankAccount {
     // Declaring interest rate for the savings account
     private double interestRate;

     // Constructor to initialize SavingsAccount object
     public SavingsAccount(String accountNumber, double balance, double interestRate) {
          super(accountNumber, balance); // Calling the superclass constructor
          this.interestRate = interestRate;
     }

     // Method to display account type specific to SavingsAccount
     @Override
     public void displayAccountType() {
          System.out.println("Account Type: Savings Account");
     }

     // Method to display the interest rate
     public void displayInterestRate() {
          System.out.println("Interest Rate: " + interestRate + "%");
     }
}


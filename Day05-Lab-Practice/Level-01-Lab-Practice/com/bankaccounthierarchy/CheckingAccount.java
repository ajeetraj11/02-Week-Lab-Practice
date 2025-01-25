package com.bankaccounthierarchy;

// Subclass representing a checking account
public class CheckingAccount extends BankAccount {
     // Declaring withdrawal limit for the checking account
     private double withdrawalLimit;

     // Constructor to initialize CheckingAccount object
     public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
          super(accountNumber, balance);
          this.withdrawalLimit = withdrawalLimit;
     }

     // Method to display account type specific to CheckingAccount
     @Override
     public void displayAccountType() {
          System.out.println("Account Type: Checking Account");
     }

     // Method to display the withdrawal limit
     public void displayWithdrawalLimit() {
          System.out.println("Withdrawal Limit: $" + withdrawalLimit);
     }
}


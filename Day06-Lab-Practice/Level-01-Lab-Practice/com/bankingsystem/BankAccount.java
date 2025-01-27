package com.bankingsystem;

// Abstract class representing a general bank account
abstract class BankAccount {

     // Field to store the account number
     private String accountNumber;

     // Field to store the account holder's name
     private String holderName;

     // Field to store the balance in the account
     private double balance;

     // Constructor to initialize bank account details
     public BankAccount(String accountNumber, String holderName, double balance) {
          // Assign the account number to the instance variable
          this.accountNumber = accountNumber;

          // Assign the account holder's name to the instance variable
          this.holderName = holderName;

          // Assign the balance to the instance variable
          this.balance = balance;
     }

     // Getter method to retrieve the account number
     public String getAccountNumber() {
          return accountNumber;
     }

     // Getter method to retrieve the account holder's name
     public String getHolderName() {
          return holderName;
     }

     // Getter method to retrieve the account balance
     public double getBalance() {
          return balance;
     }

     // Method to deposit an amount into the account
     public void deposit(double amount) {
          // Ensure the amount is positive before depositing
          if (amount > 0) {
               balance += amount; // Add the deposit amount to the balance
          }
     }

     // Method to withdraw an amount from the account
     public void withdraw(double amount) {
          // Ensure there is enough balance to withdraw
          if (amount > 0 && balance >= amount) {
               balance -= amount; // Deduct the withdrawal amount from the balance
          }
     }

     // Abstract method to calculate the interest for the account (to be implemented by subclasses)
     public abstract double calculateInterest();

     // Method to display account details
     public void getAccountDetails() {
          // Print account number, holder name, and balance
          System.out.println("Account Number: " + accountNumber);
          System.out.println("Account Holder: " + holderName);
          System.out.println("Balance: $" + balance);
     }
}

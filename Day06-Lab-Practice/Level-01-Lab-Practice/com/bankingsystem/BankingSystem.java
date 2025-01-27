package com.bankingsystem;

// Main class to test the banking system
public class BankingSystem {

     // Main method to execute the program
     public static void main(String[] args) {

          // Create a savings account object with account number, holder name, balance, and interest rate
          SavingsAccount savingsAccount = new SavingsAccount("SA201", "Ajeet Raj", 6000, 4.5);

          // Create a current account object with account number, holder name, balance, and overdraft limit
          CurrentAccount currentAccount = new CurrentAccount("CA201", "Abhishek", 2000, 1800);

          // Display details of the savings account
          System.out.println("Savings Account Details:");
          savingsAccount.getAccountDetails();
          System.out.println("Interest: $" + savingsAccount.calculateInterest());
          savingsAccount.applyForLoan(4000); // Apply for loan in savings account
          System.out.println("Loan Eligibility: " + savingsAccount.calculateLoanEligibility());

          // Display details of the current account
          System.out.println("\nCurrent Account Details:");
          currentAccount.getAccountDetails();
          System.out.println("Interest: $" + currentAccount.calculateInterest());
          currentAccount.applyForLoan(2000); // Apply for loan in current account
          System.out.println("Loan Eligibility: " + currentAccount.calculateLoanEligibility());
     }
}


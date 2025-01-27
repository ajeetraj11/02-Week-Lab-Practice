package com.bankingsystem;

// Class representing a current account
// It extends the BankAccount class and implements the Loanable interface
public class CurrentAccount extends BankAccount implements Loanable {

     // Field to store the overdraft limit for the current account
     private double overdraftLimit;

     // Constructor to initialize current account details
     public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
          // Call the parent class constructor to initialize account details
          super(accountNumber, holderName, balance);

          // Assign the overdraft limit to the instance variable
          this.overdraftLimit = overdraftLimit;
     }

     // Override the method to calculate interest for the current account
     @Override
     public double calculateInterest() {
          // Current account does not earn interest
          return 0.0;
     }

     // Implement the method to apply for a loan
     @Override
     public void applyForLoan(double amount) {
          // For current account, allow loan application if the overdraft limit is enough
          if (overdraftLimit >= amount) {
               System.out.println("Loan of $" + amount + " approved for Current Account.");
          } else {
               System.out.println("Loan of $" + amount + " cannot be approved. Insufficient overdraft limit.");
          }
     }

     // Implement the method to calculate loan eligibility
     @Override
     public boolean calculateLoanEligibility() {
          // For current account, eligible for loan if the overdraft limit is more than $1000
          return overdraftLimit > 1000;
     }
}


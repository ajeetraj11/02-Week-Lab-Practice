package com.bankingsystem;

// Class representing a savings account
// It extends the BankAccount class and implements the Loanable interface
public class SavingsAccount extends BankAccount implements Loanable {

     // Field to store the interest rate for the savings account
     private double interestRate;

     // Constructor to initialize savings account details
     public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
          // Call the parent class constructor to initialize account details
          super(accountNumber, holderName, balance);

          // Assign the interest rate to the instance variable
          this.interestRate = interestRate;
     }

     // Override the method to calculate interest for the savings account
     @Override
     public double calculateInterest() {
          // Calculate the interest based on the balance and interest rate
          return getBalance() * interestRate / 100;
     }

     // Implement the method to apply for a loan
     @Override
     public void applyForLoan(double amount) {
          // For savings account, allow loan application if the balance is greater than the loan amount
          if (getBalance() >= amount) {
               System.out.println("Loan of $" + amount + " approved for Savings Account.");
          } else {
               System.out.println("Loan of $" + amount + " cannot be approved. Insufficient balance.");
          }
     }

     // Implement the method to calculate loan eligibility
     @Override
     public boolean calculateLoanEligibility() {
          // For savings account, eligible for loan if the balance is more than $5000
          return getBalance() > 5000;
     }
}


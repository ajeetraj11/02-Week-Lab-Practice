package com.bankaccounthierarchy;

// Main class to demonstrate hierarchical inheritance
public class BankAccountHierarchy {
     public static void main(String[] args) {
          // Creating a SavingsAccount object and displaying its details
          SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000.0, 2.5);
          System.out.println("Savings Account Details:");
          savingsAccount.displayAccountDetails();
          savingsAccount.displayAccountType();
          savingsAccount.displayInterestRate();
          System.out.println();

          // Creating a CheckingAccount object and displaying its details
          CheckingAccount checkingAccount = new CheckingAccount("CA67890", 3000.0, 1000.0);
          System.out.println("Checking Account Details:");
          checkingAccount.displayAccountDetails();
          checkingAccount.displayAccountType();
          checkingAccount.displayWithdrawalLimit();
          System.out.println();

          // Creating a FixedDepositAccount object and displaying its details
          FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD11223", 10000.0, 12);
          System.out.println("Fixed Deposit Account Details:");
          fixedDepositAccount.displayAccountDetails();
          fixedDepositAccount.displayAccountType();
          fixedDepositAccount.displayMaturityPeriod();
     }
}


package com.bankaccounthierarchy;

// Subclass representing a fixed deposit account
class FixedDepositAccount extends BankAccount {
     // Declaring the maturity period for the fixed deposit account
     private int maturityPeriod; // in months

     // Constructor to initialize FixedDepositAccount object
     public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
          super(accountNumber, balance);
          this.maturityPeriod = maturityPeriod;
     }

     // Method to display account type specific to FixedDepositAccount
     @Override
     public void displayAccountType() {
          System.out.println("Account Type: Fixed Deposit Account");
     }

     // Method to display the maturity period
     public void displayMaturityPeriod() {
          System.out.println("Maturity Period: " + maturityPeriod + " months");
     }
}

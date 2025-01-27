package com.bankingsystem;

// Interface defining methods related to loans
public interface Loanable {

     // Method to apply for a loan
     void applyForLoan(double amount);

     // Method to calculate loan eligibility based on account balance
     boolean calculateLoanEligibility();
}

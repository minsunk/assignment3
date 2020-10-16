package com.meritamerica.assignment3;

//import com.meritamerica.assignment2.BankAccount;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(double openingBalance) {
		super(openingBalance);
	}

	public SavingsAccount(double openingBalance, double interestRate) {
		super(openingBalance, interestRate);
	}
	
	public SavingsAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance, interestRate);
	}


}

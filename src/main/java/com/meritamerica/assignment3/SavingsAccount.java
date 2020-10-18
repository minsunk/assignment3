package com.meritamerica.assignment3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(double balance, double interestRate) throws ParseException{
		super(balance, interestRate);
	}
	
	public SavingsAccount(double balance) throws ParseException {
		super(balance);
	}
	
	public SavingsAccount(double balance, double interestRate, Date accountOpenedOn) {
		super(balance, interestRate, accountOpenedOn);
	}

	public SavingsAccount(long accountNumber, double balance, double interestRate, Date accountOpenedOn) {
		super(accountNumber, balance, interestRate, accountOpenedOn);
	}	
	
	//static CheckingAccount readFromString(String accountData) throws ParseException
	public static SavingsAccount readFromString(String accountData) throws NumberFormatException{
		int commaCounter = 0;
		final int NUM_FIELDS = 4; 

		String[] field = new String[NUM_FIELDS];
		for (int i = 0; i < NUM_FIELDS; i++) {
			field[i] = "";
		}
		
		for (int i = 0; i < accountData.length() ; i ++) {
			if (accountData.charAt(i) == ',') {
				commaCounter++;
			} else {
				try {
					field[commaCounter] += accountData.charAt(i);
				}
				catch (ArrayIndexOutOfBoundsException e) {
					throw new NumberFormatException();
				}
				 
			}
		}
		if (commaCounter != NUM_FIELDS) {
			throw new NumberFormatException();
		}
		
		SavingsAccount newSavingsAccount = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
			newSavingsAccount = new SavingsAccount(Long.parseLong(field[0]), Double.parseDouble(field[1]),
					Double.parseDouble(field[2]), dateFormat.parse(field[3]));
		}
		catch (NumberFormatException e) {
			throw e;
			
		}
		catch (ParseException e) {
			throw new NumberFormatException();
		}
		
		return newSavingsAccount;
	}
}

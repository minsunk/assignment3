package com.meritamerica.assignment3;

public class CDAccount extends BankAccount{
	private CDOffering cdCDOffering;
	
	//1. CDAccount(CDOffering offering, double balance)
	public CDAccount(CDOffering offering, double balance){
		super(balance, offering.getInterestRate());
		cdCDOffering = offering;
	}

/*	//2. double getBalance()
 * Not needed because already defined in Parent class
	public double getBalance() {
		return cdBalance;
	}
*/	
	//3. double getInterestRate ()
	public int getTerm() {
		return cdCDOffering.getTerm();
	}
	//4.  java.util.Date getStartDate ()
	public int getStartDate(int Date) {
		return Date;
	}
/*	//5. long getAccountNumber () 
 * Not needed because already defined in Parent class
	public long getAccountNumber() {
		return super.getAccountNumber();
	}
*/	
	//6. double futureValue ()
	public double futureValue () {
		return super.accountBalance * Math.pow(1 + this.cdCDOffering.getInterestRate(), this.cdCDOffering.getTerm());
	}
	
}


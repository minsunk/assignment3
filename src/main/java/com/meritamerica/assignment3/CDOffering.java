package com.meritamerica.assignment3;

public class CDOffering {
	private int cdTerm;
	private double cdInterestRate;
	
	//1. CDOferring (int term, double interestRate)
		public CDOffering(int term, double interestRate) {
			cdTerm = term;
			cdInterestRate = interestRate;
		
		}
		
	//2. int getTerm ()
		public int getTerm() {
			return cdTerm;
			
		}
	//3. double getInterestRate ()
		public double getInterestRate() {
			return cdInterestRate;
		}
}

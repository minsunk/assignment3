package com.meritamerica.assignment3;

public class CDOffering {
	private static String cdOfferingInfo;
	private int term;
	private double interestRate;
	
	//1. CDOferring (int term, double interestRate)
		public CDOffering(int term, double interestRate) {
			this.term = term;
			this.interestRate = interestRate;
		
		}

	public CDOffering(String s, String s1) {
	}

	//2. int getTerm ()
		public int getTerm() {
			return this.term;
			
		}
	//3. double getInterestRate ()
		public double getInterestRate() {
			return this.interestRate;
		}

	@Override
	public String writeToString(){
		return term+","+interestRate;
	}

	public static int[] readFromString(int cdOfferingInfo) {
		int[] cdInfo =  cdOfferingInfo.split("regex:",");
				CDOffering cDOffering = new CDOffering(cdOfferingInfo[0], cdOfferingInfo[1]);
		return CDOffering;
	}
}
}

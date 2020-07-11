package com.ssi;

public class Accounting {
	
	private GSTCalculator calc;
	
	public void setCalc(GSTCalculator calc) {
		this.calc = calc;
	}


	public void computeGST() {
		System.out.println("Computing GST ...........");
		calc.computeGST();
	}
	
	
	public static void main(String args[]) {
		Accounting ac=new Accounting();
		//FirstGSTCalculator calculator=new FirstGSTCalculator();
		SecondGSTCalculator calculator=new SecondGSTCalculator();
		ac.setCalc(calculator);
		ac.computeGST();
	}
}

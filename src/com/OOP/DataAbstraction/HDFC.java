package com.OOP.DataAbstraction;

public class HDFC implements RBI
{
	
	public void customerDetails()
	{
		System.out.println("HDFC.....Customers details()");
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC......Withdraw()");
		
	}

	@Override
	public void deposite() {
		System.out.println("HDFC......deposite()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC......rateOfInterest() 12%");
		
	}

}

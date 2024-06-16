package com.OOP.DataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{
		//child class ref and child class object
		
		HDFC h1=new HDFC();
		h1.customerDetails();//individual
		h1.deposite();//inherited abstract method
		h1.withdraw();//inherited abstract method
		h1.rateOfInterest();//inherited abstract method
		
		
		System.out.println("**************************");
		//Parent ref and parent object-Cannot instantiate the type RBI
		//RBI r1=new RBI();
		
		//parent class ref and child class object
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateOfInterest();

	}

}

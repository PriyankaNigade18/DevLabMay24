package com.OOP.DataAbstraction;

public class TestNobelHs {

	public static void main(String[] args)
	{
		// Child class ref and child class object
		NobelHs n1=new NobelHs();
		n1.cardio();//inherited abstract 
		n1.physio();//inherited abstract 
		n1.medicalService();//individual
		n1.dental();
		n1.nero();
		n1.covid19Test();

		System.out.println("********************************");
		//parent class ref and child class object
		IMA i1=new NobelHs();
		i1.cardio();
		i1.physio();
		i1.covid19Test();
		
		System.out.println("********************************");

		USMA u1=new NobelHs();
		u1.dental();
		u1.nero();
		u1.covid19Test();
		
		
		
		
	}

}

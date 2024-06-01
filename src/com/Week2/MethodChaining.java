package com.Week2;

public class MethodChaining 
{
	/*
	 * this is keyword in java
	 * this keyword refers current class Object(instance variable and instamce method)
	 */
	//method--->Object
	public MethodChaining m1()
	{
		System.out.println("M1 is calling!");
		//this.m2();
		return this;
	}

	public MethodChaining m2()
	{
		System.out.println("M2 is calling!");
		return this;
	}

	public void m3()
	{
		System.out.println("M3 is calling!");
	}

	
	public static void main(String[] args)
	{
		MethodChaining obj=new MethodChaining ();
		
		obj.m1().m2().m3();

	}

}

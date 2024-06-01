package com.Week2;

public class MethodTypes 
{

	public void m1()
	{
		System.out.println("M1 is instance method- Object");
	}
	
	
	public static void m2()
	{
		System.out.println("M2 is static method - ClassName");
	}
	public static void main(String[] args) 
	{
		//calling area -compile time calling

		m2();
		MethodTypes.m2();
		
		MethodTypes t1=new MethodTypes();
		t1.m1();

		
		
		
		
	}

}

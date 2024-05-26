package com.Week1;

public class MethodsDemo 
{

	public void accept()
	{
		System.out.println("Accept is instance method!");
	}
	
	public static void display()
	{
		System.out.println("Display is static method");
	}
	
		
	
	public static void main(String[] args) 
	{
		//static method without class name
			display();
		//static method with class name
		MethodsDemo.display();
		
		MethodsDemo m1=new MethodsDemo();
		m1.accept();
		
//The static method display() from the type MethodsDemo should be accessed in a static way		
		//m1.display();
		
		
		
		
		
		
		
		



	}

}

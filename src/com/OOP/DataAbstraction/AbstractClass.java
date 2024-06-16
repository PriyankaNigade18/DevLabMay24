package com.OOP.DataAbstraction;

public abstract class AbstractClass
{
	/*
	 * Class declare using abstract keyword called abstract class
	 * 
	 * 1.Implemented method=method with body
	 * 2.Non implemented= method without body(abstract keyword)
	 * 
	 * This class is not fully implemented so Object is not possible
	 * To implement abstract method we need child class
	 * 
	 * Partial abstraction 
	 */

	//implemented
	public void accept()
	{
		System.out.println("Accept....Implemented method ");
	}
	
	//non implemented-abstract method
	public abstract void display();
	
	
	
	public static void main(String args[])
	{
		//Cannot instantiate the type AbstractClass
		//AbstractClass a1=new AbstractClass();
		
	}
	
	
	
	
	
	
	
}

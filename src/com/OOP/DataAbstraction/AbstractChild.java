package com.OOP.DataAbstraction;

public class AbstractChild extends AbstractClass
{

	@Override
	public void display() 
	{
		System.out.println("This is implemented by Child");
		
	}
	public void own()
	{
		System.out.println("This is child class method");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Scenario1: Child class ref and child class object");
	AbstractChild a1=new AbstractChild();
	a1.accept();//inherited
	a1.own();//individual
	a1.display();//inherited abstract method

	System.out.println("Invalid -Scenario2: Parent class ref and Parent class object");

	//not possible to create object
	//AbstractClass b1=new AbstractClass();
	
	System.out.println("Scenario2:Parent class ref and child class object");
	
	AbstractClass a2=new AbstractChild();
	a2.accept();//individual
	a2.display();//implemented child
	
	
	
	

	}

}

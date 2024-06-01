package com.Week2;

public class Person 
{
	
	//instance data
	int id=101;
	String name="Sarang";
	
	//instance method
	public void talk()
	{
		System.out.println("Person is talking");
	}
	
	public void walk()
	{
		System.out.println("Person is walking");
	}

	public static void main(String[] args) 
	{

		//Object 
		
		Person p1=new Person();
		p1.talk();
		
		
		
		

	}

}

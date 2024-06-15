package com.OOP.Inheritance;

public class Child extends Parent
{
	@Override
	public void color()
	{
		System.out.println("Blue");
	}

	
	public static void main(String[] args)
	{
		//child class ref and child class object
		Child c1=new Child();
		c1.color();//blue
		
		//parent class ref and parent class object
		Parent p1=new Parent();
		p1.color();//red
		
		//Parent class ref and Child class object
		Parent p2=new Child();
		p2.color();//blue
		
		
		
		
		
		
		
		



	}

}

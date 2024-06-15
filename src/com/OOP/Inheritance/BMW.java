package com.OOP.Inheritance;

public class BMW extends Car//single level
{

	public void autoEngine()
	{
		System.out.println("BMW.....autoEngine()");
	}
	
	@Override
	public void price()
	{
		System.out.println("BMW....80L");
	}
}

package com.OOP.Inheritance;

public class TestCar {

	public static void main(String[] args) 
	{
		System.out.println("Scenario1: child class ref and child class object");
		BMW b1=new BMW();
		b1.autoEngine();//individual
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.addBreak();
		b1.price();//bmw

		System.out.println("Scenario2: parent class ref and parent class object");

		Car c1=new Car();
		c1.start();//individual
		c1.refule();//individual
		c1.stop();//individual
		c1.addBreak();
		c1.price();//car
		System.out.println("Scenario3: parent class ref and child class object");

		Car c3=new BMW();
		c3.start();
		c3.refule();
		c3.stop();
		c3.addBreak();
		
		c3.price();//bmw
		System.out.println("**********************");
		
		Audi a1=new Audi();
		a1.autoGear();
		a1.start();
			a1.refule();
			a1.stop();
		a1.addBreak();
		
		
		
		
		
		
		
		
	}

}

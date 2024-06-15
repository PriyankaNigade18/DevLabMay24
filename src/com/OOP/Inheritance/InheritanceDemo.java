package com.OOP.Inheritance;



class A
{
	public void m1()
	{
		System.out.println("M1 is calling!");
	}
}

class B extends A//A is parent and B is child-single level Inheritance
{
	public void m2()
	{
		System.out.println("M2 is calling!");
	}
}

class C extends B//B is parent and C is child-Multilevel Inheritance
{
	public void m3()
	{
		System.out.println("M3 is calling!");
	}
}

class D extends A//A is parent and D is Child- Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("M4 is calling");
	}
}
//multiple inheritance and Hybrid not supported-Solution is interface
//class Z extends B,D
//{
//	
//}

public class InheritanceDemo {

	public static void main(String[] args)
	{

		System.out.println("Scenario1: Child class ref and child class object");
		B b1=new B();
		b1.m1();//inherited method
		b1.m2();//individual method
		System.out.println("******Multilevel*************");
		
		C c1=new C();
		c1.m1();//inherited
		c1.m2();//inherited
		c1.m3();//individual
		
		System.out.println("********* Hierarchical Inheritance************");
		
		D d1=new D();
		d1.m1();
		d1.m4();
		
		
		System.out.println("Scenario2: parent class ref and parent class object");
		
		A a1=new A();
		a1.m1();//individual
		
		System.out.println("******Multilevel*************");
		//for c class parent is B
		B b3=new B();
		b3.m1();//inherited
		b3.m2();//individual
		
		

		
		System.out.println("Scenario3: Parent class ref and child class object");
		
		A a2=new B();
		a2.m1();//individual
		System.out.println("******Multilevel*************");
		B ref=new C();
		ref.m1();//inherited
		ref.m2();//individual
		
		System.out.println("Scenario4: Invalid-child class ref and Parent class object");

		//java support top casting
		
		//B b2=new A();
		
		
		
		
		
		

	}

}

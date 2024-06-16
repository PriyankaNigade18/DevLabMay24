package com.OOP.Inheritance;

public class ChildSuper extends ParentSuper
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("child id is: "+cid);
		System.out.println("Child income is $15000");
	}
	
	public ChildSuper()
	{
		super();//super constructor
		System.out.println("This is child class constructor calling!");
	}

	public static void main(String[] args)
	{
		ChildSuper c1=new ChildSuper();
		c1.childIncome();


	}

}

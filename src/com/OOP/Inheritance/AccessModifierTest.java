package com.OOP.Inheritance;

public class AccessModifierTest {

	
	       int id=101;//default type
	public String name="Raju";
	private long phno=8776665555L;
	protected int acno=987665;
	
	
	public static void main(String[] args)
	{
		// same class

		AccessModifierTest a1=new AccessModifierTest();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
	}

}

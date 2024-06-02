package com.Week2;

public class AccessModifier 
{
		int id=101;//default
	public String name="Riya";
	private long phno=9988776655L;

	public static void main(String[] args) {
		//Within a same class
		AccessModifier obj=new AccessModifier();
		
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.phno);
		

	}

}

package com.week3_array_String;

public class WrapperDemo2 {

	public static void main(String[] args)
	{
		/*
		 * Wrapper class help to use as primitive data into Object
		 * Collection of Objects we can store using Wrapper
		 * 
		 */
		
		//primitive to Object-Autoboxing
		int i=100;
	
		Integer obj=Integer.valueOf(i);
		System.out.println(obj);
		
		
		//Object to primitive -Unboxing
		Float f1=89.66F;
		float ff1=f1.floatValue();
		System.out.println(ff1);
		
		String s1="78";
		System.out.println(s1+44);
		int num=Integer.parseInt(s1);
		System.out.println(num+44);
		
		
		
		
		
		
		
		
	

	}

}

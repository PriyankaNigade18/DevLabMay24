package com.Week1;

public class WrapperClassDemo {

	public static void main(String[] args)
	{

		//Object to primitive 
		Integer a=678;//object
		int num=a.intValue();
		System.out.println("Object to int: "+num);
		
		
		//Double to double
		Double d1=89.77;
		double dd1=d1.doubleValue();
		System.out.println("Double Object to double: "+dd1);
		
		//Float to float
		
		
		//Long to long
		
		//String is class in java 
		//String s1="100ABC";
		String s1="100";
		System.out.println(s1+100);//100100
		//string to int
		//NumberFormatException - if the string does not contain aparsable integer.
		int num1=Integer.parseInt(s1);
		System.out.println(num1+100);//200
		
		String s2="67.78";
		System.out.println(s2+11.11);//67.7811.11
		double data=Double.parseDouble(s2);
		System.out.println(data+11.11);
		
		//Primitive to Object (valueOf())
		int x=10;
		
		Integer ii1=Integer.valueOf(x);
		
		System.out.println("primitive to Object: "+ii1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package com.week3_array_String;

public class StringDemo1
{

	/*String is class in java - java.lang
String is immutable class(by default it is final)

String is collection of  characters

Ways
=========
1.using new keyword- create object inside jvm heap area and SCP
2.using literal- Create object inside SCP(String constant pool)
	 * 
	 */
	public static void main(String[] args)
		{
		
		String s1="Welcome";//scp
		String s2=new String("Welcome");//heap
		/*
		 *  == compares id provided by jvm
		 */
		
		System.out.println(s1==s2);//false
		
		
		String s3="Welcome";
		
		System.out.println(s1==s3);//true
		
		
		//String is immutable class- values can't be changed
		s1=s1+"All";
		
		System.out.println(s1==s3);//false

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

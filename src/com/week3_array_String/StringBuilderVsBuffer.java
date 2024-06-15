package com.week3_array_String;

public class StringBuilderVsBuffer {

	/*
	 * Mutable classes
	 * String builder is latest one and it is not thread safe
	 * String buffer is older one and it is a thread safe
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{

		StringBuilder br=new StringBuilder("Hello");
		System.out.println(br);
		br.append("All");
		System.out.println(br);
		
		System.out.println("Is String empty?: "+br.isEmpty());//false
		
		System.out.println("Length is: "+br.length());
		
		
		System.out.println(br.reverse());
		
		/*
		 * Reverse the string using method-StringBuilder
		 * Reverse the string without method-String class
		 * 
		 */
		
		String s1="Java Selenium";
		String res="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			res=res+s1.charAt(i);
		}
		
		System.out.println(res);
		System.out.println("**************************");
		//String is palidrome
		String ss1="madam";
		String temp=ss1;
		String r1="";
		for(int i=ss1.length()-1;i>=0;i--)
		{
			r1=r1+ss1.charAt(i);
		}
		
		System.out.println(r1);
		if(temp.equals(r1))
		{
			System.out.println("String is Palindrome!");
		}else
		{
			System.out.println("String is not a palindrome!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

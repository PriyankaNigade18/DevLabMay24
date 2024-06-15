package com.week3_array_String;

public class StringTask {

	public static void main(String[] args) 
	{
		/*
		 * even==>uppercase
		 * odd==>lowercase
		 */

		 String s1="Java Programming";
		 
		 String res="";
		 for(int i=0;i<s1.length();i++)
		 {
			 
			 if(i%2==0)
			 {
				res=res+s1.toUpperCase().charAt(i); 
			 }else
			 {
				 res=res+s1.toLowerCase().charAt(i);
			 }
			 
		 }
		 
		 System.out.println(res);
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}

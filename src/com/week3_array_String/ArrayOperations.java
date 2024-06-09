package com.week3_array_String;

public class ArrayOperations {

	public static void main(String[] args)
	{

		 int num[]={10,20,30,40,50};
		 
		//sum of array numbers
		 //System.out.println(num[0]+num[1]);//30
		 
		 System.out.println("Print the array");
		 for(int i:num)
		 {
			 System.out.println(i);
		 }
		 
		 //logic to sum
		 int sum=0;
		
		  for(int i:num)
		 {
			 sum=sum+i;
		 }
		 
		 System.out.println("Sum of Array is: "+sum);
		 
		 
		 
		 
		 
		 

	}

}

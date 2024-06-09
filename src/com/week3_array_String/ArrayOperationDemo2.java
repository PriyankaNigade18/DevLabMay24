package com.week3_array_String;

public class ArrayOperationDemo2 {

	public static void main(String[] args) 
	{

		int a[]= {10,20,30};
		int b[]= {100,200,300};
		//print result of array addition with 3rd array
		//int res[]= {110,220,330};
		
		System.out.println("*****First Array******");
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		System.out.println("*****Second Array******");
		for(int i:b)
		{
			System.out.println(i);
		}
		
		System.out.println("*****Result Array******");

		int c[]=new int[3];
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}

package com.week3_array_String;

import java.util.Arrays;

public class ArrayOperation_Sort {

	public static void main(String[] args)
	{
		/*
		 * Arrays is class in java
		 * This class contains various methods for manipulating arrays 
		 * (such assorting and searching
		 * 
		 * Array is object in java
		 */

		int a[]= {78,13,90,34,11,67,3};
		System.out.println("******Before Sort**********");
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println("******After Sort using Arrays class**********");

			Arrays.sort(a);
			//numbers are sorted
			
			for(int i:a)
			{
				System.out.println(i);
			}
		
	System.out.println("******After Sort using Bubble sort**********");

		for(int i=0;i<a.length;i++)//1st 
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				//swapping
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//printing sorted element
			System.out.println(a[i]);
		}
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}

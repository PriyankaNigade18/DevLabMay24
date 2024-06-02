package com.ControlFlowStatements;

public class LoopDemo {

	public static void main(String[] args)
	{
		//Print Hello 5 times
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("*********************");
		//print 1 to 10 numbers
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("*********************");
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("*********************");
		//sum of 100 naturals numbers
		//1+2+3+4+.......+100=5050
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}

		System.out.println("Sum of 100 naturals numbers:"+ sum);
		
		
		System.out.println("*********************");
		
		//factorial of number
		//5!=5*4*3*2*1=120
		int fact=1;
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		
		
		System.out.println("Factorial of a number 5: "+fact);
		
		
		
		
		

		
		
		
		
		
		
		
	}

}

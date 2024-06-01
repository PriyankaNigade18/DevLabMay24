package com.Week2;

import java.util.Scanner;

public class RuntimeParameterPassing 
{
	
	//method without return
	public void add(int a,int b)
	{
		System.out.println("Addition is : "+(a+b));
		
	}
//method with return
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		RuntimeParameterPassing  r1=new RuntimeParameterPassing ();
		//without return
		r1.add(num1, num2);
		//return 
		int res=r1.sub(num1, num2);
		System.out.println("Subtraction is: "+res);
		
		sc.close();
		
		
		
		

	}

}

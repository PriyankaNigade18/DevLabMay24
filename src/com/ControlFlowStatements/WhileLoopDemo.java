package com.ControlFlowStatements;

public class WhileLoopDemo {

	public static void main(String[] args)
	{

		//Print hello statement with while loop
		int i=1;
		
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}

		System.out.println("***********************");
		
		//sum of 100 natural numbers=5050
		int sum=0;
		int j=1;
		while(j<=100)
		{
			sum=sum+j;
			j++;
		}
		
		System.out.println(sum);
		System.out.println("***********************");

//		int k=1;
//		while(k<=10)
//		{
//			System.out.println("Hi");
//			//k++; infinite time 
//		}
		
		//sum of digits
		
		int num=103,rem,res=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			res=res+rem;
		}
		
		System.out.println("Sum of the digits of number "+temp+" is:" +res);
		
		System.out.println("**************************************");
		/*
		 * how to reverse a number
		 * how to check palindrom number
		 * how to check armstrong number 153
		 */
		
		
		int num1=1234,r,result=0;
		int n=num1;
		while(num1>0)
		{
			r=num1%10;
			num1=num1/10;
			result=result*10+r;
		}
		
		
		System.out.println("Reverse number of "+n+" is : "+result);
		
		/*
		 * Check number is Palindrome
		 * 
		 * 121   -----reverse------121=yes
		 * 
		 * Check number is Armstrong number
		 * 
		 * 153= (1*1*1)+(5*5*5)+(3*3*3)=153---Armstrong number
		 * 
		 */
		
		
		
		
		
		
		
		System.out.println("********************");
		
		int k=1;
		do
		{
			System.out.println("Welcome");
			k++;
		}while(k<=10);
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

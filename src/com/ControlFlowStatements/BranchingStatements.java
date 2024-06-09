package com.ControlFlowStatements;

public class BranchingStatements {

	public static void main(String[] args) 
	{

		/*
		 * break
		 * break statement will help you to exit from switch and loop
		 * 
		 * continue 
		 * to skip certain part of the code
		 */
		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;//exit from loop
			}else
			{
				System.out.println(i);
			}
		}

		System.out.println("***********************");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip the part of code
			}
			else
			{
				System.out.println(i);
			}
		}
		
		
//		if(true)
//		{
//			//break;//break cannot be used outside of a loop or a switch
//			//continue;//continue cannot be used outside of a loop
//		}
		
		
		System.out.println("******************************");
		
		int num=4;//2 3 <4 
		
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		
		if(count==0)
		{
			System.out.println(num+" is prime number");
		}else
		{
			System.out.println(num+" is not prime number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

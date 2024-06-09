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
		System.out.println("*******************************");		
		
		
//		for(;;)//by default condition true
//		{
//			System.out.println("Hi");//infinite time
//		}
		
		
		//print all even number up to 50
		
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	// print odd numbers up to 100
		
		//print table of any number?
		
		System.out.println("*************************************");
		int no=2;
		for(int i=1;i<=10;i++)
		{
		System.out.println(no*i);	
		}
		
		System.out.println("*************************************");

		//print all tables 1 to 10
		
		for(int num=1;num<=10;num++)
		{
			for(int c=1;c<=10;c++)//for all cells
			{
				System.out.print(num*c+"\t");
			}
			//next line/row
			System.out.println();
		}
		
		System.out.println("*************************************");

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();//next row
		}
		
		System.out.println("*************************************");

		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("**********************************");
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		System.out.println("**********************************");


		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
		
		System.out.println("**********************************");

		int k=1;
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("**********************************");

		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				System.out.print(i+" ");
			}else
			{
				System.out.println(i);
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}

}

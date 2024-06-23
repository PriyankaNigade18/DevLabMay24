package exceptionHandling;

import java.util.Scanner;

public class RunTimeException
{

	int id=101;
	
	public static void main(String[] args)
	{
		
		RunTimeException r1=new RunTimeException();
		r1=null;
		try {
			System.out.println(r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			//n.printStackTrace();
			System.out.println("Check the Object It is null!");
		}
		
				
			System.out.println("******************************");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for conversion ");
		String data=sc.nextLine();//string
		//string --->int
		try {
		int num=Integer.parseInt(data);//NumberFormatException
		System.out.println(num);
		}catch(Exception e)
		{
			System.out.println("Enter only number");
		}
		
		System.out.println("******************************");
		
		Scanner sc1=new Scanner(System.in);		

		System.out.println("Enter index between 0 to 4");
		int index=sc1.nextInt();
		
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Please enter valid index number!");
		}
		
System.out.println("******************************");
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc2.nextInt();
		int b=sc2.nextInt();
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		try {
		System.out.println("Division is: "+(a/b));//ArithmeticException
		}catch(ArithmeticException aa)
		{
			System.out.println("Enter number other than zero");
		}
		System.out.println("Multiplication is: "+(a*b));
		sc.close();

	}

}

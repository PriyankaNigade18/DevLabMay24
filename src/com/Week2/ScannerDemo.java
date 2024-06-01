package com.Week2;

import java.util.Scanner;

public class ScannerDemo {

	public void details(String name,String email,char gen,int age,long phno)
	{
		System.out.println("Your name is: "+name);
		System.out.println("Your email is: "+email);
		System.out.println("Your gender is: "+gen);
		System.out.println("Your age is: "+age);
		System.out.println("Your phone number is: "+phno);
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your email");
		String email=sc.nextLine();
		System.out.println("Enter your gender(M/F)");
		char gen=sc.nextLine().charAt(0);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your phonenumber");
		long phno=sc.nextLong();
		
		
		//method call using object
			ScannerDemo s1=new ScannerDemo();
		
		s1.details(name, email, gen, age, phno);
		
		
		
		
		

	}

}

package com.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUsers {

	public static void main(String[] args) throws IOException
	{
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Your name is: "+name);
		
		System.out.println("Your age is: "+age);
		sc.close();
		
		
		
		
		/*
		// technique2: BufferedReader
		System.out.println("Enter your age:");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		int age=Integer.parseInt(data);
		System.out.println(age);
		
		
		/*
		// technique1: 
			System.out.println("Enter you age:");//32
		
			int age=System.in.read();
			System.out.println("Your age is: "+(char)age);
		 */
	}

}

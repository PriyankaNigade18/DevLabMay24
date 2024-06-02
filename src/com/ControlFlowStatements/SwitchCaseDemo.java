package com.ControlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your enviornment");
		String env=sc.nextLine();
		
		switch (env.toLowerCase())
		{
		case "dev":
			System.out.println("Test is executing on "+env);
			break;//exit from switch
		case "qa":
			System.out.println("Test is executing on "+env);
			break;
		case "stage":
			System.out.println("Test is executing on "+env);
			break;
		case "prod":
			System.out.println("Test is executing on "+env);
			break;

		default:
			System.out.println("Please select Enviornment!");
			
		}
		
		
		
		
		
		
		
		
		/*
		 * 
		 * 
		 * 
	if(env.equalsIgnoreCase("Dev"))
	{
		System.out.println("Test is executing on "+env);
	}else if(env.equalsIgnoreCase("QA"))
	{
		System.out.println("Test is executing on "+env);
	}else if(env.equalsIgnoreCase("stage"))
	{
		System.out.println("Test is executing on "+env);
	}else if(env.equalsIgnoreCase("prod"))
	{
		System.out.println("Test is executing on "+env);
	}else
	{
		System.out.println("Please Update correct Enviornment");
	}
		*/
	}

}

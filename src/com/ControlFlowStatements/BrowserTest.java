package com.ControlFlowStatements;

import java.util.Scanner;

public class BrowserTest {

	public static void main(String[] args)
	{

		/*
		 * test equality between strings
		 * 1.equals()
		 * ----------------
		 * equals() looks for exact matching
		 * equals() is case sensitive
		 * 
		 * 2.equalsIgnoreCase()
		 * ----------------------
		 * equalsIgnoreCase() looks for exact matching
		 * equalsIgnoreCase() is not case sensitive
		 
		String s1="Hello All";
		String s2="Hello all";
			
		
		System.out.println("equals():"+s1.equals(s2));
		
		System.out.println("equalsIgnoreCase(): "+s1.equalsIgnoreCase(s2));
		
		*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name:chrome/firefox/edge");
		String bname=sc.nextLine();		
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing "+bname);
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing "+bname);
		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing "+bname);
		}else
		{
			System.out.println("Invalid search!");
		}
		
		

	}

}

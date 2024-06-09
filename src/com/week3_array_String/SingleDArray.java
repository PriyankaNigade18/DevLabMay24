package com.week3_array_String;

public class SingleDArray {
/*
 * Array
=========
Collection of similar data types which is static in nature
Array size always fixed!

Array is static data structure

In java Array implemented as Object

Ways
=============
1.Using  new keyword - as Array is object in java
2.Using literal way

Array always starts with indexing 0
size =9
index=0-8
 */
	public static void main(String[] args) 
		{


		//declare
		int sid[]=new int[5];
		//Initialize
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Size of an array: "+sid.length);
		
		//fetch single data from array
		System.out.println(sid[3]);//104
		
		System.out.println(sid[2]);//103
		
		//for wrong index-exception occurs
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		//all data from array
		System.out.println("****************Iteration using for loop***************");
		
		for(int i=0;i<sid.length;i++)//indexing
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("****************Iteration using for-each loop***************");

		for(int i:sid)
		{
			System.out.println(i);
		}
		
		
		System.out.println("*********************************************");
		
		String loc[]=new String[3];
		loc[0]="Pune";
		loc[1]="Nashik";
		loc[2]="Mumbai";
		
		System.out.println("Total size: "+loc.length);
		
		
		
		for(int i=0;i<loc.length;i++)
		{
			System.out.println(loc[i]);
		}
		System.out.println("****************Iteration using for-each loop***************");

		for(String i:loc)
		{
			System.out.println(i);
		}
		
		System.out.println("**********************************************");
		
		double marks[]=new double[4];
		marks[0]=40.45;
		marks[1]=89.45;
		marks[2]=67.45;
		marks[3]=90.45;
		
		System.out.println("Total marks in array: "+marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("****************Iteration using for-each loop***************");

		for(double i:marks)
		{
			System.out.println(i);
		}
		System.out.println("**********************************************");
		
		//Literal way
		
		Object empdata[]={"Sarang","Pune",'M',30,988777666L,78.88};
		
		System.out.println("Total size: "+empdata.length);//6
		System.out.println(empdata[4]);
		
		System.out.println("*************");
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(empdata[i]);
		}
		
		System.out.println("****************Iteration using for-each loop***************");

		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

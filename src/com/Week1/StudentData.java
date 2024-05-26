package com.Week1;

public class StudentData
{
	//data
	int id;
	String name;
	
	
	//method
	public void display()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	//to execute java code
	public static void main(String args[])
	{
		/*
		 * calling function
		 * To call class members we need object to be create
		 * Object is instance of a class
		 * Object has two partition 1.data 2. method
		 * Object is important to access member of a class
		 * 
		 */
		System.out.println("Student 1 record!");
		StudentData s1=new StudentData();
		//s1.display();//default
		s1.id=101;
		s1.name="Tom";
		s1.display();
		
		System.out.println("Student 2 record!");
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Sam";
		s2.display();
		
		
		
		
		
	}
	
	

}

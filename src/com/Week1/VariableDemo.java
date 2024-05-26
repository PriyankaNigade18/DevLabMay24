package com.Week1;

public class VariableDemo
{
	//instance variable
	int id=101;
	String name="Sam";
	static String cname="AISSMPMs";//static variable
	
	
	public void show()
	{
		System.out.println("College name is: "+cname);
		int marks=90;//local
		System.out.println(id);
		System.out.println(name);
		System.out.println("marks from show: "+marks);
		
	}

		
	public static void main(String[] args) 
	{
		System.out.println("College name is: "+cname);
	
		int marks=100;//local 
		System.out.println("Marks from main():"+marks);

		//object
		VariableDemo v1=new VariableDemo();
		System.out.println("Student id id: "+v1.id);
		System.out.println("Student name is:"+v1.name);
		
		v1.show();
	}

}

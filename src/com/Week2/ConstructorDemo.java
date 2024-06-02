package com.Week2;

public class ConstructorDemo 
{
	//instance variable
	int id;
	String name;
	
	//Default Constructor
	public ConstructorDemo()
	{
		System.out.println("Default constructor Call!");

		System.out.println("id is: "+id);//0
		System.out.println("name is: "+name);//null
	}
	
	//parameterized constructor
	public ConstructorDemo(int i,String n)//2 parameter
	{
		//initilization of object
		System.out.println("Parameterized constructor Call!");
		//instance=local
		id=i;
		name=n;
		
	}
	//method
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
	}
	

	public static void main(String[] args)
	{

		ConstructorDemo c1=new ConstructorDemo();//default constructor- jvm
		
		ConstructorDemo c2=new ConstructorDemo(101,"Reena");//parameterized 
		c2.show();
	}

}

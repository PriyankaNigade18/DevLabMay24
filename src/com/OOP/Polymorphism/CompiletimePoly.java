package com.OOP.Polymorphism;

/*Compile time polymorphism
 * 
 * Method Can be overloaded when method has same name and used multiple time
 * in same class with different signature
 * 1.Number of arguments
 * 2.Types of arguments
 * 3.Change the order of argument
 * 
 * Constructor overloading is possible in java but not overriding
 * Main() overloading is Possible?
 * yes -but technically we never used this anywhere
 * 
 * main() overriding is not possible
 * 
 */
public class CompiletimePoly

{
	
	public void add()//0 parameter
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
	}
	
	//1.number of arguments
	public void add(int a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	public void add(int a,int b,int c)//3 parameter
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	//2.type of arguments
	public void add(double a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//3.Change the order of argument
	public void add(int a,double b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//constructor
	public CompiletimePoly()
	{
		System.out.println("Default constructor calling....");
	}

	
	public CompiletimePoly(int id)
	{
		System.out.println("Parameterized constructor...with id: "+id);
	}
	
	public CompiletimePoly(String name)
	{
		System.out.println("Parameterized constructor...with name: "+name);
	}
	
	
	
	public static void main(String[] args) 
	{
		CompiletimePoly c1=new CompiletimePoly();
		c1.add();
		c1.add(200.11,10);
		c1.add(100,245.55);
		c1.add(10,100000);
		c1.add(100, 200,30000);
		
		CompiletimePoly c2=new CompiletimePoly("Pooja");

	}

}

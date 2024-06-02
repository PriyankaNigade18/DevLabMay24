package com.Week2;

public class ThisKeywordDemo3 {

	//this() can be used to invoke current class constructor.
	ThisKeywordDemo3()
	{
		this("Hi");
		System.out.println("Default constructor is calling");
	}
	
	
	ThisKeywordDemo3(String msg)
	{
		//this();//this constructor
		System.out.println("Parameterized constructor is calling: "+msg);
		
	}
	
	
	
	public static void main(String[] args)
	{
		//ThisKeywordDemo3 t1=new ThisKeywordDemo3("Hello All");
		ThisKeywordDemo3 t2=new ThisKeywordDemo3();
	}

}

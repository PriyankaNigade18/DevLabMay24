package com.OOP.Inheritance;

//final class Demo
class Demo
{
	final int x=100;
	
	public final void color()
	{
		System.out.println("Color is Blue");
	}
}




//The type FinalKeywordDemo cannot subclass the final class Demo
public class FinalKeywordDemo extends Demo
{
	//Cannot override the final method from Demo
//	@Override
//	public void color()
//	{
//		System.out.println("Color is Pink");
//	}
	
	public static void main(String[] args) 
	{
		FinalKeywordDemo f1=new FinalKeywordDemo();
		System.out.println(f1.x);//100
		//The final field Demo.x cannot be assigned
		//f1.x=200;
		System.out.println(f1.x);//100
		f1.color();//blue

	}

}

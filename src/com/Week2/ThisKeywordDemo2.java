package com.Week2;

public class ThisKeywordDemo2 {

	//-this can be used to invoke current class method (implicitly)
	
	public void m1()
	{
		System.out.println("M1 is calling!");
		//m2();//
		this.m2();
	}
	
	public void m2()
	{
		System.out.println("M2 is calling!");
		this.M3();
	}
	
	public void M3()
	{
		System.out.println("M3 is calling!");
		//m1();//StackOverflowError
	}
	
	public static void main(String[] args)
	{

		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.m1();
		
//		t1.m2();
//		t1.M3();


	}

}

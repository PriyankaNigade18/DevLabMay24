package exceptionHandling;

import java.io.IOException;

public class ThrowsDemo 
{
	public void m1() throws IOException
	{
		System.out.println("M1 is calling!");
		m2();
	}
	
	public void m2() throws IOException
	{
		System.out.println("M2 is calling!");
		m3();
	}
	
	public void m3() throws IOException
	{
		System.out.println("M3 is calling!");
		System.out.println("Enter a number");
		int num=System.in.read();
		System.out.println((char)num);
	}

	public static void main(String[] args) throws IOException {

		ThrowsDemo  t1=new ThrowsDemo ();
		t1.m1();

	}

}

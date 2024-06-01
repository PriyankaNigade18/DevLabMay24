package com.Week2;

public class CompileTimeParameterPassing
{
	
	public void add()//0 local parameters
	{
		int a=10,b=20;//local variable
		System.out.println("Addition is: "+(a+b));
	}
	
	public void sub(int a,int b)//2 parameters- a=100 b=60
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	//return
	public int mul(int a,int b)//2 parameters
	{
		return a*b;//return result to calling function
	}
	
	
	public String info(String msg)
	{
		return msg;
	}

	
	public boolean status(boolean st)
	{
		return st;
	}
	
	
	public static void main(String[] args)
	{

		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		c1.add();
		/*
		 * Whenever we pass values at the time of compilation is caLLED
		 * compile time parameters passing!
		 * Arguments: original data(numbers)
		 * Parameters: arguments assigned to parameters
		 * compile time parameter passing without return
		 * 
		 * return Keyword
		 * ====================
		 * return keyword used to return values from the method
		 * at the of use of return change return type of the method
		 * return keyword return the value to calling function
		 */
		c1.sub(100,60);
		
		System.out.println(c1.mul(10,10));
		
//		int result=c1.mul(10,10);
//		System.out.println(result);
		
		boolean resB=c1.status(true);
		System.out.println(resB);
		

		String resS=c1.info("Hello All!");
		System.out.println(resS);

	}

}

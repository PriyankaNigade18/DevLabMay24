package com.Week1;

public class DataTypesDemo {

	public static void main(String[] args) 
	{
		// boolean  1bit true/false 
		boolean status=true;
		System.out.println("boolean status is: "+status);

		status=false;
		System.out.println("boolean updated status is: "+status);
		
		System.out.println("*********************************");
		
		/*
		 * char type
		 * =============
		 * char is under numeric family -2byte memory
		 * 
		 * 1.single character we can store
		 * 2.Ascii values in characters
		 * 3.special characters we can store
		 * 
		 * A-Z= 65 to 90
		 * a-z= 97 to 122
		 * 0 to 9= 48 to 57
		 * 
		 */
		
		char ch1='A';
		System.out.println("characte data is ch1: "+ch1);//A
		char ch2='$';
		System.out.println("characte data is ch2: "+ch2);//$s

		char ch3=90;//90 as ascii value for character Z
		System.out.println("characte data is ch3: "+ch3);//Z
		
		char ch4=99;
		System.out.println(ch4);//c
		
		char ch5=50;
		System.out.println(ch5);//2


		System.out.println("***************************************");
		/*
		 * Numeric---->Integral---->Integer
		 * byte -->short--->int(default)--->long
		 * 
		 * 
		 */
		
		//byte  1byte -128 to 127
		byte b1=127;
		//Type mismatch: cannot convert from int to byte
		//byte b2=130;
		
		byte b2=120;
		byte b3=-128;
		byte b4=-125;
		//byte b5=-129;
		
		System.out.println("byte data is: "+b1);
		System.out.println("byte data is: "+b2);
		System.out.println("byte data is: "+b3);
		System.out.println("byte data is: "+b4);
		
		//short 2byte -32768 to 32767
		short s1=1000;
		short s2=30000;
		//Type mismatch: cannot convert from int to short
		//short s3=50000;
		System.out.println("Short data is: "+s1);
		System.out.println("Short data is: "+s2);
		
		//int 4byte 
		int i1=50000;
		int i2=987655688;
		//The literal 9999999999 of type int is out of range 
		//int i3=9999999999;
		
		System.out.println("integer data is: "+i1);
		System.out.println("integer data is: "+i2);
		
		//long 8byte 
		long l1=9999999999L;
		System.out.println("long data is: "+l1);
		
		long l2=90L;
		System.out.println("long data is: "+l2);
		
		System.out.println("****************************************");
		/*
		 * Numeric--->Integral--->Floating point
		 * 78.88
		 * 1.float 4byte 
		 * 2.double 8byte (default)
		 * 
		 *  
		 */
		
		
		double d1=98765.6789;
		System.out.println("double data is: "+d1);
		
		float f1=67.55F;
		System.out.println("float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

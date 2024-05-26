package com.Week1;

public class TypeCastingDemo {

	public static void main(String[] args)
	{
		//Implicit casting small size ----->large size
		byte b1=122;//1byte
		
		short s1=b1;//2byte
		
		System.out.println("byte to short: "+s1);
		
		//numeric but not integral
		char ch='A';//2byte
		
		//short ss1=ch;
		
		int i1=ch;//65 4byte
		System.out.println("charcater to int: "+i1);//65
		
		long l1=i1;  //8byte
		System.out.println("intgere to long: "+l1);//65
		//floating point
		float f1=l1;
		System.out.println("long to float: "+f1);//65.0
		
		
		//Explicit large size of data into small size
		
		long no=99999999999L;
		int i2=(int)no;
		System.out.println("long to int conversion: "+i2);
		
		int i3=99;//4byte
		char ch2=(char) i3;//2byte
		System.out.println("int to char conversion: "+ch2);
		
		
		double d1=89.77;//8byte
		float f2=(float) d1;//4byte
		System.out.println("double to float conversion: "+f2);
		
		short ss1=(short) ch2;
		System.out.println("char to short: "+ss1);
		
		//Wrapper class
		
		Integer i=89;
		int num=i.intValue();
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

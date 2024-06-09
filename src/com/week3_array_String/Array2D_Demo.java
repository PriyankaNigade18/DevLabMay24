package com.week3_array_String;

public class Array2D_Demo {

	public static void main(String[] args)
	{

		//using new keyword
		int arr[][]=new int[3][2];
		arr[0][0]=10;
		arr[0][1]=20;
		
		arr[1][0]=30;
		arr[1][1]=40;
		
		arr[2][0]=50;
		arr[2][1]=60;
		
		//row-->cell-->value
		System.out.println("Number of rows: "+arr.length);//3
		System.out.println("Number of cells: "+arr[0].length);//2

		//single data
		System.out.println(arr[0][1]);//20
		//System.out.println(arr[2][2]);//ArrayIndexOutOfBoundsException
		
		System.out.println("*******Iteration using for loop***************");
		
		for(int r=0;r<arr.length;r++)
		{
			
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("********************");
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("**********************************");
		
		Object data[][]= {{"username","password"},{"Admin","admin123"},{"Riya","test123"},{"Suresh","test123"},{"Admin","admin123"}};
		
		System.out.println("Number of rows: "+data.length);//4
		System.out.println("Number of columns: "+data[0].length);//2
		
		System.out.println(data[2][0]);//Suresh
		
		System.out.println("***for loop******");
		
		for(int r=1;r<data.length;r++)
		{
			for(int c=0;c<data[r].length;c++)
			{
				System.out.print(data[r][c]+" ");//same row all cols
			}
			System.out.println();//next row
		}
		
		System.out.println("************************************");
		
		
		for(Object i[]: data)
		{
			for(Object j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("***********Jagged Array*******************");
		
		int sid[][]= {{101},{201,202},{301,302,303,304}};
		
		System.out.println("Number of Rows: "+sid.length);//3
		System.out.println("Number of cells: "+sid[2].length);//4
		
		for(int i[]:sid) {
					
			for(int j:i)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
		
		
	}

}

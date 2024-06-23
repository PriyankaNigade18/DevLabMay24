package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1
{
	/*
	 * ArrayList is a class implements List interface
	 * Underline data structure is Dynamic array
	 * It is ordered collection based in indexing
	 * It allowed duplicate elements
	 * By default ArrayList provide 10 virtual segments
	 * 
	 */

	public static void main(String[] args)
	{
		
		//non-Generic way - not a type safe and type casting
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add('r');
//		al.add(34.89);
//		al.add("Amit");
//		System.out.println(al);
//		int num=(int) al.get(0);
//		System.out.println(num);
		
		
		
		//Generic Way to declare ArrayList- type safe and no type casting required

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(10);
		al.add(45);
		al.add(56);
		
		System.out.println(al);
		
		int num= al.get(0);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3_Iteration {

	/*
	 * ArrayList is a class implements List interface
	 * Underline data structure is Dynamic array
	 * It is ordered collection based in indexing
	 * It allowed duplicate elements
	 * By default ArrayList provide 10 virtual segments(initial Capacity)
	 * Frequent operation is data retrieval
	 * ArrayList is not synchronized!
	 * (At a time multiple process it can handle)
	 * 
	 * Iteration 
	 * ---------------
	 * 1.using simple for loop
	 * 2.using for each loop
	 * 3.using iterator()
	 * 
	 */
	public static void main(String[] args)
	{

		ArrayList<String> loc=new ArrayList<String>();
		loc.add("India");
		loc.add("US");
		loc.add("UK");
		
		System.out.println(loc);
		System.out.println("*******For loop***********");
		
		
		for(int i=0;i<loc.size();i++)
		{
			System.out.println(loc.get(i));
		}
		System.out.println("*******For each loop***********");

		for(String i:loc)
		{
			System.out.println(i);
		}
		System.out.println("*******iterator()***********");
/*
 * In Java Iterator is interface
 * iterator() is available in Iterable Interface
 * 
 * iterator() return Iterator interface Object
 * 1.hasNext(): Returns true if the iteration has more elements
 * 2.next():Returns the next element in the iteration.
 * 
 * 
 */
	Iterator<String> ir=loc.iterator();	
	while(ir.hasNext())
	{
		System.out.println(ir.next());
	}
	
	
	System.out.println("*************************");

		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(2178.56);
		marks.add(555.66);
		
		for(Double i:marks)
		{
			System.out.println(i);
		}
		
		System.out.println("*************************");
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("Sarang");
		empdata.add(30);
		empdata.add('M');
		empdata.add(56.88);
		
		for(Object i:empdata)
			
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

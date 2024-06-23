package collectionFramework;
/*
 * ArrayList is a class implements List interface
 * Underline data structure is Dynamic array
 * It is ordered collection based in indexing
 * It allowed duplicate elements
 * By default ArrayList provide 10 virtual segments
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo_Methods {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Before elements added Is list empty?: "+al.isEmpty());//true
		//to add element -add()
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(30);
		System.out.println("After elements added Is list empty?: "+al.isEmpty());//false
		
		System.out.println("Total Elements are: "+al.size());
		
		System.out.println(al);
		//add element at specific position- add(index,value)
		al.add(4,1000);
		System.out.println(al);
		
		//search any element-contains()
		System.out.println("List contains 100?: "+al.contains(100));//false
		
		System.out.println("List contains 40?: "+al.contains(40));//true

		//remove the element from list- remove(index)
		al.remove(4);
		System.out.println(al);
		
		al.add(4,null);
		System.out.println(al);
		
		int index=al.indexOf(null);
		System.out.println("Index of object: "+index);
		
		//comparison based on elements(Object)
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		
		boolean status=list1.equals(list2);
		System.out.println("List are equals?: "+status);
		
		//sublist()-Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
		List<Integer> res=al.subList(1,4);
		System.out.println(res);
		//toArray()
		Object arr[]=al.toArray();
		for(Object i:arr)
		{
			System.out.println(i);
		}
		
		
		//Integer arr1[]=al.toArray();
		
		
	
	
	
		
		//to clear the list- clear()
		al.clear();
		
		System.out.println(al);//[]
		System.out.println(al.size());//0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}

package collectionFramework;

import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet is class implements Set interface
	 * HashSet underline data structure is HashTable
	 * It is unordered 
	 * Duplicate elements not allowed
	 * It stores value as per hashing mechanism
	 * Internal capacity is 16 virtual segment
	 * Hashtable stores element as per hashing means
	 * it calculate key and hashcode for element and based on (key,code) calculate index
	 * as  per index stores value
	 * 
	 * key|code|element|address of next element
	 * 
	 * null value hashcode and index always 0
	 */
	public static void main(String[] args)
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		hs.add(null);
		
		System.out.println("Total : "+hs.size());
		
		System.out.println(hs);
		
		System.out.println("Empty?: "+hs.isEmpty());
		
		hs.remove(null);
		
		System.out.println(hs);
		
		System.out.println("Search 100: "+hs.contains(100));
		System.out.println("Search 20: "+hs.contains(20));
		
		System.out.println("**************");
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		
		
		
		

	}

}

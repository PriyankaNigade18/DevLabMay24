package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	/*
	 * LinkedHashSet is class which extends HashSet class and implements Set interface
	 * It maintains insertion order
	 * It store unique elements
	 * Underline data structure is DoublyLinkedList
	 */
	public static void main(String[] args)
	{

		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		if(ls.isEmpty())
		{
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			ls.add(50);
			ls.add(null);
			ls.add(50);
			
		}
		System.out.println("Total Elements are: "+ls.size());
		System.out.println(ls);
		
		System.out.println("Search 40?: "+ls.contains(40));
		System.out.println("Search 70?: "+ls.contains(70));
		
		
		//remove
		ls.remove(null);
		
		System.out.println(ls);
		
		System.out.println("********for each loop*********");
		
		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		//remove duplicate character 
		String ss1="aabbccaa";
		
		LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
		for(int i=0;i<ss1.length();i++)
		{
			ch.add(ss1.charAt(i));
		}
		
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

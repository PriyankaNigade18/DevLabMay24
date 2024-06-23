package collectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	/*
	 * LinkedList is class implements List interface
	 * Underline data structure is DoublyLinkedList
	 * It allow duplication
	 * It is ordered collection
	 * Not synchronized
	 * 
	 */
	public static void main(String[] args)
	{
		LinkedList<Integer> ls=new LinkedList<Integer>();
		
		if(ls.isEmpty())
		{
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(30);
			ls.add(40);
			ls.add(50);
			
		}
		
		System.out.println("Total Elements are: "+ls.size());
		
		System.out.println(ls);
		
		ls.add(4,9999);
		
		System.out.println(ls);
		System.out.println("100?: "+ls.contains(100));
		System.out.println("20?: "+ls.contains(20));
		
		ls.remove(0);
		
		System.out.println(ls);
		
		ls.addFirst(1000);
		
		ls.addLast(2000);
		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		System.out.println(ls);
		
		System.out.println("*******ListIterator************");
		
		ListIterator<Integer> lr=ls.listIterator();
		
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		System.out.println("************************");
	
		while(lr.hasPrevious())
		{
			System.out.println(lr.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package collectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * TreeSet is class extends SortedSet implement Set
	 * TreeSet is based on SearchTree
	 * It always return elements in sorted order
	 * null not allowed
	 * 
	 * 
	 */
	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(2);
		ts.add(8);
		ts.add(7);
		ts.add(9);
		ts.add(4);
		ts.add(1);
		ts.add(5);
		ts.add(11);
		
		System.out.println(ts);
		
		System.out.println("Total Elements: "+ts.size());
		
		System.out.println("Search 11?: "+ts.contains(11));
		
		System.out.println("Less than element: "+ts.headSet(9));
		System.out.println("greater and equal element: "+ts.tailSet(9));
		System.out.println("between elements: "+ ts.subSet(7, 11));
		
		System.out.println(ts.descendingSet());
		
		
		

	}

}

package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassDemo {

	public static void main(String[] args)
	{
		/*
		 * Collection is interface
		 * Collections is class which has static method
		 */
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(30);
		al.add(10);
		al.add(50);
		al.add(90);
		al.add(1);
		al.add(22);
		
		System.out.println(al);
		//sort()
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println("MinElement: "+Collections.min(al));
		
		System.out.println("MaxElement: "+Collections.max(al));
		
//		ArrayList<Integer> al2=new ArrayList<Integer>(6);
//		Collections.copy(al2,al);
//		System.out.println(al2);
		
		
		
		
		
		
		
		

	}

}

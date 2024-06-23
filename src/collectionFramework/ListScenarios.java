package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class ListScenarios
{
	/*
	 * Arrays class
	 * ===================
	 * 
	 */

	public static void main(String[] args)
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		System.out.println("List1: "+list1);
		
		//List<Integer> list2=Arrays.asList(40,50,60,70,80);
		//using constructor
		ArrayList<Integer> list2=new ArrayList<Integer>(list1);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(70);
		System.out.println("List2: "+list2);
		
		System.out.println("*****************");
		//using addAll()
		
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list1);
		list3.add(40);
		list3.add(50);
		list3.add(60);
		list3.add(70);
		System.out.println("List3: "+list3);
		
		
		List<Integer> l1=Arrays.asList(10,20,30);
		
		List<Integer> l2=Arrays.asList(40,50);
		
		ArrayList<List<Integer>> finalList=new ArrayList<List<Integer>>();
	
		finalList.add(l1);
		finalList.add(l2);
		
		
		System.out.println(finalList);
		
		
//		ArrayList<List<List<Integer>>> finalList2=new ArrayList<List<List<Integer>>>();
//		finalList2.addAll(l1);
	
		System.out.println("******Remove duplicate elements from List*********");
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		System.out.println(al1);
		
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>(al1);
		//hs.addAll(al1);
		System.out.println(hs);
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
	}

}

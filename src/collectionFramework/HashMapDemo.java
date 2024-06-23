package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	/*
	 * HashMap class implements Map interface
	 * Underline data structure is HashTable
	 * <Key,value>
	 * put()
	 * getKey() getValue()
	 */
	public static void main(String[] args)
	{

		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Lohegaon",411047);
		map.put("VimanNagar",411047);
		map.put("Kharadi",411044);
		map.put("Wagholi",411049);
		map.put("Nagar",411049);
		map.put("Satara",411050);
		System.out.println(map);
		
		System.out.println("Total: "+map.size());
		System.out.println("Search for Key Kharadi: "+map.containsKey("Kharadi"));
		System.out.println("Search for value 411048: "+map.containsValue(411048));
		
		//remove 
		map.remove("Nagar");
		System.out.println(map);
		
		map.remove("Satara",411050);
		System.out.println(map);
		
		
		/*
		 * Iteration is possible with Entry interface
		 * 
		 * Entry<Key,Value>
		 *  
		 */
		
		System.out.println("*************Iteration using for loop********");
		
		for(Map.Entry<String,Integer> i:map.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		System.out.println("*************Iteration iterator()********");

		//map--->Set--->iterator
		Set<Entry<String,Integer>> set=map.entrySet();
		Iterator<Entry<String,Integer>> ir=set.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
	}

}

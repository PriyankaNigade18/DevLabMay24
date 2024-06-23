package collectionFramework;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) 
	{

		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101,"C Programming");
		ht.put(102,"C++");
		ht.put(103,"Java");
		ht.put(104,"Python");
		
		System.out.println(ht);
		System.out.println("Total Entry: "+ht.size());
		
		System.out.println("Search key 105?: "+ht.containsKey(105));
		System.out.println("Search key 102?: "+ht.containsKey(102));
 
		//remove
		ht.remove(104);
		
		System.out.println(ht);
		
		System.out.println("**********************");
		//Iterate
		for(Map.Entry<Integer,String> i:ht.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
			
		}
			
		

	}

}

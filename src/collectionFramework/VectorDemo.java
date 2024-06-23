package collectionFramework;

import java.util.Vector;

public class VectorDemo {
/*
 * Vector is class implement List interface
 * Vector is synchronize(thread-safe)at a time one process
 * Vector performance is slow
 * Vector is based on Dynamic Array
 */
	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>();
		
	System.out.println("Vector is empty?: "+v1.isEmpty());
	v1.add(10);
	v1.add(20);
	v1.add(30);
	
	System.out.println(v1);
	System.out.println("TotaL: "+v1.size());

	}

}

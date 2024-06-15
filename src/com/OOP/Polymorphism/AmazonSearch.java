package com.OOP.Polymorphism;

public class AmazonSearch 
{
	
	public void search()
	{
		System.out.println("Product serach with default product");
	}

	public void search(String pname)
	{
		System.out.println("Product serach with product name: "+pname);
	}
	
	public void search(int price)
	{
		System.out.println("Product serach with product price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Product serach with product name: "+pname+" and brand name: "+bname);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product serach with product name: "+pname+" and price: "+price);
	}
	public void search(int price,String bname)
	{
		System.out.println("Product serach with product price: "+price+" and brand name: "+bname);
	}
}

package com.OOP.Polymorphism;

public class AmazonSerachTest {

	public static void main(String[] args) 
	{

		AmazonSearch a1=new AmazonSearch();
		a1.search();
		a1.search("Bag");
		a1.search(20000);
		a1.search(30000,"Zara");
		a1.search("Iphone15",990000);
		a1.search("Watch","Titen");

	}

}

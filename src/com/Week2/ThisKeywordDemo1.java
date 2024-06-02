package com.Week2;

public class ThisKeywordDemo1 

{
	//instance variable
		int id;
		String name;
		
		
	//parameterized constructor
	public ThisKeywordDemo1(int id,String name)//2 parameter
	{
		//this keyword can be used to refer current class instance variable.
			System.out.println("Parameterized constructor Call!");
			//instance=local
			this.id=id;
			this.name=name;
			
	}
		//method
		public void show()
		{
			System.out.println("Id is: "+id);
			System.out.println("Name is: "+name);
		}

	public static void main(String[] args) 
	{
		ThisKeywordDemo1 t1=new ThisKeywordDemo1(101,"Reena");
		t1.show();
		

	}

}

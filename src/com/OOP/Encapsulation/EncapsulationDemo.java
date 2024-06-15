package com.OOP.Encapsulation;


class Employee
{
	//Encapsulation = private data +Public Method to set the data and get the data
	//getters() -get the data setters() - set the data
	private int id=101;
	private String name="Pavan";
	
	//public methods
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

//business logic
	public void show()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
	
}




public class EncapsulationDemo {

	public static void main(String[] args) 
	{

		Employee e1=new Employee();
		e1.show();
		e1.setId(201);
		e1.setName("Pravin");
//		e1.id=201;
//		e1.name="Prabhas";
		e1.show();

	}

}

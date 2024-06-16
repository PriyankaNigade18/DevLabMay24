package com.OOP.Encapsulation;

import com.OOP.Inheritance.AccessModifierTest;

public class DifferntPackageClass extends AccessModifierTest
{

	public static void main(String[] args)
	{

		AccessModifierTest a1=new AccessModifierTest();
		System.out.println(a1.name);

		//Protected data you can access only through subclass
		DifferntPackageClass d1=new DifferntPackageClass();
		System.out.println(d1.name);
		System.out.println(d1.acno);
	}

}

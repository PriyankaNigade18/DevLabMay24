package collectionFramework;

public class Student implements Comparable
 {

	int age=17;
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.compareTo(s1);


	}


	public int compareTo(Student s1) {
		
		if(s1.age>=15)
		{
			System.out.println("true");
			return 1;
		}
		return 0;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

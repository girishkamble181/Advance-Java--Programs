// to get class name

import java.lang.*;

class Student extends Object
{
	int rno;
	String name;

	Student(int rno , String name)
	{
		this.rno = rno;
		this.name = name;
	}

	public String toString()
	{
		return ("rno = "+ rno + " name = " + name);
	}
}

class get_class_name
{
	public static void main(String args[])
	{
		Student s1 = new Student(10, "Girish");
		Student s2 = new Student(20, "Tejas");
		System.out.println(s1.getClass());		//cannot be overriden
		System.out.println(s2.getClass());		//cannot be overriden

		Student s3 = new Student(30, "Kodag");
		Student s4 = new Student(40, "Indra");
		System.out.println(s3.getClass());		//cannot be overriden
		System.out.println(s4.getClass());		//cannot be overriden
	}
}
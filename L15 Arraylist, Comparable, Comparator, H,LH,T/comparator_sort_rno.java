// wap to sort list of students (rno , name)
// using Comparator

import java.util.*;

class DescRno implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s2.rno - s1.rno;
	}
}

class AscRno implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.rno - s2.rno;
	}
}

class AlphaName implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

class RevAlphaName implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s2.name.compareTo(s1.name);
	}
}

class Student
{
	int rno;
	String name;

	Student(int rno, String name)
	{
		this.rno = rno;
		this.name = name;
	}
	
	public String toString()
	{
		return rno + " " + name;
	}
}

class comparator_sort_rno
{
	public static void main(String args[])
	{
		Student s1 = new Student(10, "Girish");
		Student s2 = new Student(30, "Tejas");
		Student s3 = new Student(20, "Indra");
		Student s4 = new Student(40, "Kodag");

		ArrayList<Student> s = new ArrayList<>();
		s.add(s1);	s.add(s2);	s.add(s3);	s.add(s4);

		Collections.sort(s, new DescRno());
		for(Student k : s)
			System.out.println(k);

		System.out.println();
	
		Collections.sort(s, new AscRno());
		for(Student k : s)
			System.out.println(k);

		System.out.println();
		
		Collections.sort(s, new AlphaName());
		for(Student k : s)
			System.out.println(k);

		System.out.println();

		Collections.sort(s, new RevAlphaName());
		for(Student k : s)
			System.out.println(k);


	}
}
// wap to sort list of students

import java.util.*;
class Student implements Comparable<Student>
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
		return rno + " " + name;
	}
	public int compareTo(Student s)
	{
		return s.rno - rno;
	}
}

class sort_list_stud
{
	public static void main(String args[])
	{
		Student s1 = new Student(10, "Girish");
		Student s2 = new Student(30, "Kodag");
		Student s3 = new Student(20, "Tejas");
		Student s4 = new Student(40, "Apoorv");
	
		ArrayList<Student> s = new ArrayList<>();
		s.add(s1);	s.add(s2);	s.add(s3);	s.add(s4);
		
		Collections.sort(s);
		for(Student k : s)	
			System.out.println(k);
	}
			
	
}


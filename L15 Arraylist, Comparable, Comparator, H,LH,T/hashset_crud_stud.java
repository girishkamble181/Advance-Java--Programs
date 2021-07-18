import java.io.*;
import java.util.*;

class Student
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

	public boolean equals(Object o)
	{
		Student s = (Student) o;
		return rno == s.rno;
	}

	public int hashCode()	
	{
		return rno;
	}
}

class hashset_crud_stud
{
	public static void main(String args[])
	{
		Console c= System.console();
		HashSet<Student> stu = new HashSet<>();

		while(true)
		{
			int op = Integer.parseInt(c.readLine("1 add, 2 view, 3 remove, 4 exit "));	
			if (op == 1 )
			{
				int rno = Integer.parseInt(c.readLine("enter rno "));
				String name = c.readLine("enter name ");	
				Student s = new Student(rno, name);
				if(stu.add(s))
					System.out.println(rno + " added");
				else
					System.out.println(rno + "  already present");				
			}
			else if (op == 2)
			{
				for(Student k : stu)
					System.out.println(k);
			}
			else if (op == 3)
			{

			}
			else if (op == 4)
			{
				break;
			}
			else
			{
				System.out.println("Invalid input");
			}

		}
	}
}
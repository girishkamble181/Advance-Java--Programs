// wamdoojp for list of students

import java.io.*;
import java.util.*;

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

class arraylist_crud_stud
{
	public static void main(String args[])
	{
		Console c = System.console();
		ArrayList<Student> data = new ArrayList<>();

		while(true)
		{
			int op = Integer.parseInt(c.readLine("1 add, 2 view, 3 remove and 4 exit "));
			if (op == 1)
			{
				int rno = Integer.parseInt(c.readLine("enter rno "));
				String name = c.readLine("enter name ");
				Student s = new Student(rno , name);
				data.add(s);
			}
			else if (op == 2)
			{
				for (Student k : data)
				{
					System.out.println(k);
				}
			}
			else if (op == 3)
			{
				int r = Integer.parseInt(c.readLine("enter roll no to remove "));
				for(Student k : data)	
				{
					if(k.rno == r)	
					{
						data.remove(k);
						break;
					}
				}
				
			}
			else if (op == 4)
			{
				break;
			}
			else
			{
				System.out.println("Invalid Option");
			}
		}
	}
}
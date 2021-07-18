// wap for data persistence using file mngment

import java.io.*;
import java.util.*;

class Student implements Comparable<Student>, Serializable
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

	public int compareTo(Student s)
	{
		return rno - s.rno;
	}
}

class data_persis_file_mgmt_comparable
{
	static TreeSet<Student> data = new TreeSet<>();

	public static void main(String args[])
	{
		Console c = System.console();
	
		restore();
		
		while(true)
		{
			int op = Integer.parseInt(c.readLine("1 create, 2 read and 3 exit "));
			
			if (op == 1)
			{
				int rno = Integer.parseInt(c.readLine("enter rno "));
				String name = c.readLine("enter name ");
				Student s = new Student(rno, name);
				data.add(s);
			}
			else if(op == 2)
			{
				for (Student k : data)
					System.out.println(k);	
			}
			else if(op == 3)
			{
				save();
				break;
			}
			else
			{
				System.out.println("invalid input");
			}
		
		}
	}

	public static void save()		// object --> file
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("skd");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(data);
			oos.close();
		}
		catch(Exception e)
		{
			System.out.println("issue "+ e);
		}
	}

	public static void restore()		// file --> object
	{
		try
		{
			FileInputStream fis = new FileInputStream("skd");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			data = (TreeSet<Student>)(ois.readObject());			//downcasting
			ois.close();
		}
		catch(Exception e)
		{
			System.out.println("issue "+ e);
		}
	}
	
}

// class		encapsulation
// object		instantiation
// save			serialization / deflate / marshalling
// restore		deserialization / inflate / unmarshalling
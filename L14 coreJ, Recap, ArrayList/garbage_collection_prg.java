// garbage collection 

class Student
{
	static int count;
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

	public void finalize()					// after accepting the request for gc			
	{
		count ++;
	}
}

class garbage_collection_prg
{
	public static void main(String args[])
	{
		Student s1 = new Student(10, "Girish");
		Student s2 = new Student(20, "Tejas");
		Student s3 = new Student(30, "Kodag");
		Student s4 = new Student(40, "Indra");
		s1 = s4;  s2 = s4;  s3 = s4;			//referencing
		System.out.println(s1);	
		System.out.println(s2);	
		System.out.println(s3);	
		System.out.println(s4);
		System.gc();					// request for garbage collection
		System.out.println(Student.count);
			
	}
}
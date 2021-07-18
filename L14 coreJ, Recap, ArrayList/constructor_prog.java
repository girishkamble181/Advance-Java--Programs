// advanace java (object class understanding)
// using constructor

class Student extends Object
{
	int rno;
	String name;	
	
	Student(int rno , String name)				// constructor
	{
		this.rno = rno;
		this.name = name;
	}

	public String toString()				// method is in the Object class. And we have overided the method here
	{
		return ("rno = " + rno + " name = " + name);
	}
}

class constructor_prog
{
	public static void main(String args[])
	{
		Student s1 = new Student(10, "Girish");		
		System.out.println(s1);				// no need to call it will print return value	
		Student s2 = new Student(20, "Tejas");
		System.out.println(s2);				// no need to call it will print return value				
	}
}
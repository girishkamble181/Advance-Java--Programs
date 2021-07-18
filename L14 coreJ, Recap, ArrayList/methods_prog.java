// core java
// using methods

class Student
{
	int rno;
	String name;
	
	void setData(int rno, String name)
	{
		this.rno = rno;
		this.name = name;
	}
	void showData()
	{
		System.out.println(rno + " " + name);
	}
}

class methods_prog
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setData(10,"Girish");
		s1.showData();

		Student s2 = new Student();
		s2.setData(20,"Tejas");
		s2.showData();
	}
}
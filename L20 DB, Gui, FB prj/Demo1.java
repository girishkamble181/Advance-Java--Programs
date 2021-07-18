class MyClass
{
	public void mymethod()
	{
		System.out.println("Hello");
	}

}

class Demo1
{
	public static void main(String args[])
	{
		MyClass m1 = new MyClass()
		{
			public void mymethod()
			{
				System.out.println("hello world");
			}
		};
	m1.mymethod();
	}
}
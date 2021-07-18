interface A
{
	void m1();
}

class B implements A
{
	public void m1()
	{
		System.out.println("old way");
	}
}

class Demo2
{
	public static void main(String args[])
	{
		B b = new B();
		b.m1();

		B b1 = new B()
		{
			public void m1()
			{
				System.out.println("new way");
			}
		};
		b1.m1();
	}
}
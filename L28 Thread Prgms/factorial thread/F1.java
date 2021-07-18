class F1 implements Runnable
{
	int n;
	
	F1(int n)
	{
		this.n = n;
	}

	public void run()
	{
		try
		{
			if (n < 0)
				throw new Exception("- ve not allowed");
			else
			{
				int fact = 1;
				for(int i=1; i<=n; i++)
					fact = fact * i;
				System.out.println("fact = " + fact);
			}
		}
		catch(Exception e)
		{
			System.out.println("issue " + e);
		}
	}
}
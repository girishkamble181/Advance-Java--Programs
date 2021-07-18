import java.util.concurrent.*;

class F2 implements Callable<Integer>
{
	int n;
	
	F2(int n)
	{
		this.n = n;
	}

	public Integer call() throws Exception
	{
		if (n < 0)
			throw new Exception("- ve not allowed");
		else
		{
			int fact = 1;
			for(int i=1; i<=n; i++)
			{
				fact = fact * i;
			}
			return fact;
		}
	}
}
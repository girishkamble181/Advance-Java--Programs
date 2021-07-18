import java.io.*;
import java.util.concurrent.*;
	
class thread_menuD_factorial
{
	public static void main(String args[])
	{
		Console c = System.console();
		while(true)
		{
			int op = Integer.parseInt(c.readLine("1 runnable, 2 callable and 3 exit "));
			if (op == 1)
			{
				int num = Integer.parseInt(c.readLine("enter numbe "));
				F1 f = new F1(num);
				Thread t1 = new Thread(f);
				t1.start();
			}
			else if (op == 2)
			{
				int num = Integer.parseInt(c.readLine("enter numbe "));
				try
				{	
					F2 f = new F2(num);
					ExecutorService es = Executors.newFixedThreadPool(1);
					Future res = es.submit(f);
					System.out.println("res = " + res.get());
					es.shutdown();
				}
				catch(Exception e)	
				{
					System.out.println("issue " + e);
				}
			}
			else if (op == 3)
			{
				break;
			}
			else
			{
				System.out.println("invalid option");
			}
		}
	}
}
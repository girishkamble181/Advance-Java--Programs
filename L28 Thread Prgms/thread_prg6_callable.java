// thread using callable

import java.util.concurrent.*;

class Writing implements Callable<Integer>
{
	public Integer call()
	{	
		System.out.println("Writing work started ");
		for (int i =1; i <= 10; i++)
		{
			System.out.println("writing assignment " + i);
			try
			{
					Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
		}
		System.out.println("writing work ended ");
		return 0;	
	}
}


class Listening implements Callable<Float>
{
	public Float call()
	{
		System.out.println("Songs Started ");
		for(int i = 1; i <=20; i++)
		{
			System.out.println("song " + i);
			try	
			{
				Thread.sleep(500);
			}	
			catch(InterruptedException e)
			{ }
		}
		System.out.println("Songs ended");
		return 0.0f;
	}
}

		
class thread_prg6_callable
{
	public static void main(String args[])
	{
		System.out.println("aaj ka kaam shuru ");
		Writing w = new Writing();
		Listening l = new Listening();
			
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(w);
		es.submit(l);

		es.shutdown();	
		try
		{
			es.awaitTermination(24L, TimeUnit.HOURS);
		}
		catch(InterruptedException e) { }
		System.out.println("aaj ka kaam over");
	}
}
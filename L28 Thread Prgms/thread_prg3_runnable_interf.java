// Thread Prgm 2 using Runnable Interface

class Writing implements Runnable
{
	public void run()
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
	}
}

class Listening implements Runnable
{
	public void run()
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
	}
}

class thread_prg3_runnable_interf
{
	public static void main(String args[])
	{
		System.out.println("aaj ka kaam shuru ");
		Writing w = new Writing();
		Thread t1 = new Thread(w);
		t1.start();

		Listening l = new Listening();
		Thread t2 = new Thread(l);
		t2.start();
			
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)	
		{ }

		System.out.println("aaj ka kaam over");
	}
}
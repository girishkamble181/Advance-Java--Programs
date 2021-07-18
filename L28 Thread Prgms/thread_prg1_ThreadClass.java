// Thread Prgm using Thread Class

class Writing extends Thread
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

class Listening extends Thread
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

class thread_prg1_ThreadClass
{
	public static void main(String args[])
	{
		System.out.println("aaj ka kaam shuru ");
		Writing w = new Writing();
		w.start();

		Listening l = new Listening();
		l.start();
			
		try
		{
			w.join();
			l.join();
		}
		catch(InterruptedException e)	
		{ }

		System.out.println("aaj ka kaam over");
	}
}
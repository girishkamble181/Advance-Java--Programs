// thread using lambda expression

class thread_prg5_lambda_exprss
{
	public static void main(String args[])
	{
		System.out.println("aaj ka kaam shuru ");
		Runnable r1 = () -> 
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
		};	
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> 
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
	
		};

		Thread t2 = new Thread(r2);
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
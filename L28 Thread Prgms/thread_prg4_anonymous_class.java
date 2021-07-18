// thread using anonymous class

class thread_prg4_anonymous_class
{
	public static void main(String args[])
	{
		System.out.println("aaj ka kaam shuru ");
		Thread t1 = new Thread(new Runnable(){
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
				{ }
			}
			System.out.println("writing work ended ");
		}});
		t1.start();

	
		Thread t2 = new Thread(new Runnable(){
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
		}});
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
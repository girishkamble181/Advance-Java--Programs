// wap to read list of marks from the user and print the sum and avg marks

import java.io.Console;
import java.util.ArrayList;

class arraylist_sum_avg
{
	public static void main(String args[])
	{
		Console c = System.console();
		ArrayList<Integer> marks = new ArrayList<>();
		
		String reply = c.readLine("do u want to enter marks y/n ");
		while(reply.equals("y"))
		{
			int m = Integer.parseInt(c.readLine("enter marks "));
			marks.add(m);			
			reply = c.readLine("do u want to enter more marks y/n ");
		}
	
		double sum = 0.0, avg= 0.0;
		for(Integer k : marks)
			sum = sum +k;
		
		avg = sum / marks.size();

		System.out.printf("sum = %.2f%n", sum);
		System.out.printf("avg = %.2f%n", avg);
	}
}
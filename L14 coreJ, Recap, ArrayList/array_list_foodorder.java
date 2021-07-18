// wap to keep track food order by gk
// ArrayList --> size dynamic --> <> ==> Generic Element Type --> ref 
// Array --> size fixed --> type --> pri and ref


import java.io.*;		// console
import java.util.*;		// ArrayList

class array_list_foodorder
{
	public static void main(String args[])
	{
		Console c = System.console();
		ArrayList<String> food_item = new ArrayList<>();
		
		String reply = c.readLine("would u like to order something y/n ");
		while (reply.equals("y"))
		{
			String name = c.readLine("enter food name ");
			food_item.add(name);
			reply = c.readLine("would u like to order something more y/n ");
		}
		System.out.println("items ordered "+ food_item);
	}

}
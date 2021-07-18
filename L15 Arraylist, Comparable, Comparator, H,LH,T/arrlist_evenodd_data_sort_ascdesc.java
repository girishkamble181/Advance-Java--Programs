// wap to read integers from the user create even_data and odd_data
// and even_data shuld be displayed in asc order and odd_data shuld be displayed in desc order

import java.io.*;
import java.util.*;

class arrlist_evenodd_data_sort_ascdesc
{
	public static void main(String args[])
	{
		Console c = System.console();
		ArrayList<Integer> data = new ArrayList<>();
		
		String reply = c.readLine("do u want to enter some data y/n ");
		while(reply.equals("y"))
		{
			int d= Integer.parseInt(c.readLine("enter data "));
			data.add(d);
			reply = c.readLine("do u want to enter some more data y/n ");	
		}
		
		ArrayList<Integer> even_data = new ArrayList<>();
		ArrayList<Integer> odd_data = new ArrayList<>();
		
		for(Integer k : data)
		{
			if( k % 2 == 0)
				even_data.add(k);
			else
				odd_data.add(k);
		}

		
		Collections.sort(even_data);
		
		Collections.sort(odd_data);
		Collections.reverse(odd_data);

		System.out.println(data);
		System.out.println(even_data);
		System.out.println(odd_data);

	}
}
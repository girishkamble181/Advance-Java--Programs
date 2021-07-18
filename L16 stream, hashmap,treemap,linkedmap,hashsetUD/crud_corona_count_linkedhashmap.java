// wap for perform CURD/CRUD on corona count

import java.io.*;
import java.util.*;

class crud_corona_count_linkedhashmap
{
	public static void main(String args[])
	{
		Console c = System.console();
		LinkedHashMap<String, Integer> corona_counter = new LinkedHashMap<>();
	
		while(true)
		{
			int op = Integer.parseInt(c.readLine("1 add, 2 view, 3 update, 4 remove, and 5 exit "));
			
			if (op == 1)
			{
				String station_name = c.readLine("enter station name to be added ");
				if (corona_counter.get(station_name) == null)
				{
					int co = Integer.parseInt(c.readLine("enter count "));
					corona_counter.put(station_name, co);
				}
				else
				{
					System.out.println(station_name + "already prsent ");
				}
			}
			
			else if (op == 2)	
			{
				System.out.println("corona counter = "+ corona_counter);
			}
			
			else if (op == 3)
			{
				String station_name = c.readLine("enter station name to be updated ");
				if (corona_counter.get(station_name) != null)
				{
					int co = Integer.parseInt(c.readLine("enter new count "));
					corona_counter.put(station_name, co);
				}
				else
				{
					System.out.println(station_name + "not prsent ");
				}
			}
			
			else if (op == 4)
			{
				String station_name = c.readLine("enter station name to be deleted ");
				if (corona_counter.get(station_name) != null)
				{
					corona_counter.remove(station_name);
				}
				else
				{
					System.out.println(station_name + "not prsent ");
				}

			}
		
			else if (op == 5)
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
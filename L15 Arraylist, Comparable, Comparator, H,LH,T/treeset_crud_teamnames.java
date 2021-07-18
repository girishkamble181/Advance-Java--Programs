// wap for crud operations to add remove view team names
// using TreeSet

import java.util.*;
import java.io.*;

class treeset_crud_teamnames
{
	public static void main(String args[])
	{
		Console c = System.console();
		TreeSet<String> team_names = new TreeSet<>();

		while(true)
		{
			int op = Integer.parseInt(c.readLine("1 add, 2 view, 3 remove, 4 exit "));
			if (op == 1)
			{
				String name = c.readLine("enter team name ");

				if (team_names.add(name))
					System.out.println(name + " added");
				else
					System.out.println(name + " already present ");
			}


			else if (op == 2)
			{
				System.out.println("team name = "+ team_names);
			}


			else if (op == 3)
			{
				String name = c.readLine("enter team name to be removed ");
				if (team_names.remove(name))
					System.out.println(name + " removed");
				else
					System.out.println(name + " not present ");
			}

			else if (op == 4)
			{
				break;
			}
			else
			{
				System.out.println("Invalid Input");
			}
			
		}
	}
}
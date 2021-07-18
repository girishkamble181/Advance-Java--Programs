// wap to read marks of student from the user and
// print  the lowest and highest marks
// Collection --> Interface
// Collections --> class --> utility function --> sort(), reverse(), binary search()

import java.io.*;
import java.util.*;

class arrlist_collection_lowest_highst_mrks
{
	public static void main(String args[])
	{
		Console c = System.console();
		ArrayList<Integer> marks = new ArrayList<>();
	
		String reply = c.readLine("do u want to add some marks y/n ");
		while(reply.equals("y"))
		{
			int m = Integer.parseInt(c.readLine("enter marks "));
			marks.add(m);
			reply = c.readLine("do u want to add some more marks y/n ");
		}	

		Collections.sort(marks);

		int lowest = marks.get(0);
		int highest = marks.get(marks.size() - 1);
			
		System.out.println(lowest + " " + highest);
	}
}
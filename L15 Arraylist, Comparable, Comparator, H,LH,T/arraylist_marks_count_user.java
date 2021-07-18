// wap to read list of marks from the user and print the count of students
// who have got >= 80 , got >= 60, got >= 40 and remaining
// using ArrayList


import java.io.*;
import java.util.*;

class arraylist_marks_count_user
{
	public static void main(String args[])
	{
		Console c = System.console();
		ArrayList<Integer> marks = new ArrayList<>();

		String reply = c.readLine("do u want to enter students marks y/n ");
		while(reply.equals("y"))
		{
			int m = Integer.parseInt(c.readLine("enter marks "));
			marks.add(m);
			reply= c.readLine(" do u want to enter students more marks y/n ");	
		}
		
		int c1=0, c2=0, c3=0, c4=0;
		for(Integer k : marks)
		{
			if(k >= 80)		c1++;
			else if(k >= 60)	c2++;
			else if(k >= 40)	c3++;
			else			c4++;
		}
		System.out.println(c1 + " " + c2 + " " + c3 + " " + c4);
	}
}
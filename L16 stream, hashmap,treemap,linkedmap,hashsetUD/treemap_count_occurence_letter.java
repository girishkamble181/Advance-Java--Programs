// wap to count occurrence of each letter in the givemn word
// i/p : ggirrisss {"g=2", "i=2", "r=2", "s=3"}

import java.util.*;
import java.io.*;

class treemap_count_occurence_letter
{
	public static void main(String args[])
	{
		Console c = System.console();
		String word = c.readLine("enter a word ");

		TreeMap<String , Integer> lc = new TreeMap<>();
	
		for(int i = 0; i < word.length(); i++)
		{
			String s = new String(""+word.charAt(i));
			Integer co = lc.get(s);
			if (co == null)
				lc.put(s,1);
			else
				lc.put(s,co+1);
		}
		System.out.println(lc);
	}
}
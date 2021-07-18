// wap to create a list of unique odd numbers sorted in descending order
// using stream

import java.util.*;

class stream_list_unique_oddnum_desc
{
	public static void main(String args[])
	{
		ArrayList<Integer> data = new ArrayList<>( Arrays.asList(10, 40, 30, 20, 10, 40, 45, 67, 91, 10, 40, 91, 51, 93, 56, 91, 64));

		ArrayList<Integer> new_data = new ArrayList();

		for(Integer k : data)
		{
			if(! new_data.contains(k))			// check uniqueness
			{	
				if(k % 2 != 0)				// check odd
					new_data.add(k);			
			}
		}
		
		Collections.sort(new_data);
		Collections.reverse(new_data);
		System.out.println(data);
		System.out.println(new_data);

		data.stream().distinct().filter(e -> e % 2 != 0).sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
		System.out.println();

		data.parallelStream().distinct().filter(e -> e % 2 != 0).sorted(Comparator.reverseOrder()).forEachOrdered(n -> System.out.print(n + " "));
		System.out.println();
	}
}
//wap to even list and sort elements in  ArrayList using stream and parallel stream

import java.util.*;
import java.util.stream.*;

class stream_parallelS_evenl_sort
{
	public static void main(String args[])
	{
		ArrayList<Integer> data = new ArrayList<>( Arrays.asList(10, 40, 30, 20, 10, 40, 45, 67, 91, 10, 40, 91, 51, 93, 56, 91, 64));
		

		ArrayList<Integer> new_data = new ArrayList<>();
		
		for(Integer k : data)
		{	
			if( k % 2 == 0)
			new_data.add(k);
		}
		Collections.sort(new_data);
		System.out.println(data);
		System.out.println(new_data);

		data.stream().filter(e -> e % 2 == 0).sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		data.parallelStream().filter(e -> e % 2 == 0).sorted().forEachOrdered(n -> System.out.print(n + " "));
		System.out.println();

		List<Integer> girish = data.stream().filter(e -> e % 2 == 0).sorted().collect(Collectors.toList());
		System.out.println(girish);
	}
}
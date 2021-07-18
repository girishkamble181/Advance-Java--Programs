// wap to increment each integer by 2 using stream and parallel stream


import java.util.*;

class incr_by_2_stream_parallelS
{
	public static void main(String args[])
	{
		ArrayList<Integer> data = new ArrayList<>( Arrays.asList(10, 40, 30, 20, 10, 40, 45, 67, 91, 10, 40, 91, 51, 93, 56, 91, 64));
		
		System.out.println(data);
		for(int i=0; i<data.size(); i++)
			data.set(i, data.get(i) + 2);
		System.out.println(data);

		data.stream().map(e -> e + 2).forEach(n -> System.out.print(n + " "));
		

	}
}
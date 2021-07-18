// wap to find sum of all integers using stream and parallel stream

import java.util.*;
class sum_allint_stream_parallelS
{
	public static void main(String args[])
	{
		ArrayList<Integer> data = new ArrayList<>( Arrays.asList(10, 40, 30, 20, 10, 40, 45, 67, 91, 10, 40, 91, 51, 93, 56, 91, 64));

		int sum = 0;
		for(Integer k : data)
			sum = sum + k;
		System.out.println("sum = "+sum);

		int res = data.stream().reduce(0, (a,b) -> a + b);
		System.out.println("res = "+res);

		int ares = data.parallelStream().reduce(0, (a,b) -> a + b);
		System.out.println("ares = "+ares);
	}
}
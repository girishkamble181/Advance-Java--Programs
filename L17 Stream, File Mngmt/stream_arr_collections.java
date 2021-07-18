// wap for stream

import java.util.stream.*;
import java.util.*;

class stream_arr_collections
{
	public static void main(String args[])
	{
		//directly
		Stream<Integer> s1 = Stream.of(40, 20, 10, 50 ,20);
		s1.forEach(e -> System.out.print(e + " "));
		System.out.println();

		Stream<String> s2 = Stream.of("indra", "girish", "tejas");
		s2.forEach(System.out::println);

		//array
		Integer a1[] = {12, 34, 67, 31};
		Stream<Integer> s3 = Stream.of(a1);
		s3.forEach(e -> System.out.print(e + " "));
		System.out.println();

		//collections
		List<Integer> a2 = new ArrayList<>();
		a2.add(10);	a2.add(30);	a2.add(20);

		Stream<Integer> s4 = a2.stream();
		s4.forEach(e -> System.out.print(e + " "));
		System.out.println();

		Stream<Integer> s5 = a2.parallelStream();
		s5.forEachOrdered(e -> System.out.print(e + " "));
		System.out.println();

		
	}
}
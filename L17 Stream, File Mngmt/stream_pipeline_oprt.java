// wap for stream using pipeline operations

import java.util.stream.*;
import java.util.*;

class stream_pipeline_oprt
{
	public static void main(String args[])
	{
		
		Stream<Integer> s1 = Stream.of(40, 20, 20, 10, 10, 50, 40, 20);
		System.out.println(s1.count());

		Stream<Integer> s2 = Stream.of(40, 20, 20, 10, 10, 50, 40, 20);		// repeated value will not print
		System.out.println(s2.distinct().count());

		Stream<Integer> s3 = Stream.of(40, 20, 20, 10, 10, 50, 40, 20);
		s3.sorted().forEach(e -> System.out.print(e + " "));			
		System.out.println();
		
		Stream<Integer> s4 = Stream.of(40, 20, 20, 10, 10, 50, 40, 20);
		s4.distinct().sorted().forEach(e -> System.out.print(e + " "));			
		System.out.println();

		Stream<Integer> s5 = Stream.of(40, 20, 20, 10, 10, 50, 40, 20);
		s5.distinct().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));			
		System.out.println();
		
		
	}
}
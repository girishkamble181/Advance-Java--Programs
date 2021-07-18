//wap to use functions of streams


import java.util.stream.*;
import java.util.*;

class stream_funct
{
	public static void main(String args[])
	{
		
		Stream<Integer> s1 = Stream.of(40, 20, 20, 10, 10, 50, 40, 20);
		s1.filter(n -> n > 30).forEach(e -> System.out.print(e + " "));		// print data which is > 30
		System.out.println();

		Stream<Integer> s2 = Stream.of(40, 20, 20, 10, 10, 50, 40, 20);		// add +10 to each element in an stream
		s2.map(n -> n + 10).forEach(e -> System.out.print(e + " "));
		System.out.println();
	
		Stream<Integer> s3 = Stream.of(40, 20, 20, 10, 10, 50, 40, 20);		// reducing the value
		System.out.println(s3.reduce(0 , (a,b) -> (a+b)));

		Stream<Double> s4 = Stream.of(40.0, 20.0, 20.0, 10.0, 10.0, 50.0, 40.0, 20.0);
		System.out.println(s4.reduce(1.0 , (a,b) -> (a*b)));
		
	}
}
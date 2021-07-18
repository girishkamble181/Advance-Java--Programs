// wap to use readymade functions of stream
// using primitive data types

import java.util.stream.*;
import java.util.*;

class rdymadefunc_primitive_dt
{
	public static void main(String args[])
	{
		int a1[] = {12, 34, 67, 31};
		IntStream s1 = IntStream.of(a1);
		s1.forEach(e -> System.out.print(e + " "));			
		System.out.println();

		IntStream s2 = IntStream.of(a1);	
		System.out.println(s2.max().getAsInt()); 

		IntStream s3 = IntStream.of(a1);	
		System.out.println(s3.min().getAsInt()); 

		IntStream s4 = IntStream.of(a1);	
		System.out.println(s4.sum()); 
		
		IntStream s5 = IntStream.of(a1);
		System.out.println(s5.average().getAsDouble());
	}
}
//wap for hashset

import java.util.*;

class hashset_linkedhashset_treeset_prg
{
	public static void main(String args[])
	{
		HashSet<Integer> rno1 = new HashSet<>();
		rno1.add(10);		rno1.add(30);
		rno1.add(20);		rno1.add(10);
		rno1.add(40);		rno1.add(30);
		System.out.println(rno1);

		LinkedHashSet<Integer> rno2 = new LinkedHashSet<>();
		rno2.add(10);		rno2.add(30);
		rno2.add(20);		rno2.add(10);
		rno2.add(40);		rno2.add(30);
		System.out.println(rno2);

		TreeSet<Integer> rno3 = new TreeSet<>();
		rno3.add(10);		rno3.add(30);
		rno3.add(20);		rno3.add(10);
		rno3.add(40);		rno3.add(30);
		System.out.println(rno3);


	}
}
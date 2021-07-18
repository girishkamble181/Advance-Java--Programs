// WAP for HashMap ,  LinkedMap, TreeMap

import java.util.*;

class put_hashmap_linkedmap_treemap_prg
{
	public static void main(String args[])
	{
		HashMap<String, Integer> e1 = new HashMap<>();
		e1.put("bjp", 40);		e1.put("aap", 20);
		e1.put("tmc", 30);		e1.put("bjp", 50);
		e1.put("aap", 30);	
		e1.putIfAbsent("kp", 2);	e1.putIfAbsent("kp", 5);
		System.out.println(e1);

		LinkedHashMap<String, Integer> e2 = new LinkedHashMap<>();
		e2.put("bjp", 40);		e2.put("aap", 20);
		e2.put("tmc", 30);		e2.put("bjp", 50);
		e2.put("aap", 30);	
		e2.putIfAbsent("kp", 2);	e2.putIfAbsent("kp", 5);
		System.out.println(e2);

		TreeMap<String, Integer> e3 = new TreeMap<>();
		e3.put("bjp", 40);		e3.put("aap", 20);
		e3.put("tmc", 30);		e3.put("bjp", 50);
		e3.put("aap", 30);	
		e3.putIfAbsent("kp", 2);	e3.putIfAbsent("kp", 5);
		System.out.println(e3);
	
	}
}

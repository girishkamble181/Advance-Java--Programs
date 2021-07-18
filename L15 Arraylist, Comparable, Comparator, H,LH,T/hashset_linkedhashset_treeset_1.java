// wap for Hashset , Linked Hashset, Treeset

import java.util.*;
class hashset_linkedhashset_treeset_1
{
	public static void main(String args[])
	{
		HashSet<String> ipl1 = new HashSet<>();
		ipl1.add("mi");		ipl1.add("csk");
		ipl1.add("mi");		ipl1.add("rr");
		ipl1.add("csk");	ipl1.add("srh");

		System.out.println(ipl1);

		LinkedHashSet<String> ipl2 = new LinkedHashSet<>();
		ipl2.add("mi");		ipl2.add("csk");
		ipl2.add("mi");		ipl2.add("rr");
		ipl2.add("csk");	ipl2.add("srh");

		System.out.println(ipl2);

		TreeSet<String> ipl3 = new TreeSet<>();
		ipl3.add("mi");		ipl3.add("csk");
		ipl3.add("mi");		ipl3.add("rr");
		ipl3.add("csk");	ipl3.add("srh");
		
		System.out.println(ipl3);
	} 
}
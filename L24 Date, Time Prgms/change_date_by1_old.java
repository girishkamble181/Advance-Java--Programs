// change date by 1 day (old method)

import java.util.*;
import java.text.*;

class change_date_by1_old
{
	public static void main(String args[])
	{
		Date d = new Date();
		System.out.println(d);

		d.setTime(d.getTime() + (24 * 60 * 60 * 1000));
		System.out.println(d);	
	}
}
// time and date display 1

import java.util.*;
import java.text.*;

class time_date_prg1
{
	public static void main(String args[])
	{
		Date d = new Date();
		System.out.println(d);

		DateFormat df = DateFormat.getDateInstance();
		String sdf = df.format(d);
		System.out.println("date = " + sdf);

		DateFormat tf = DateFormat.getTimeInstance();
		String stf = tf.format(d);
		System.out.println("time = " + stf);
	}
}
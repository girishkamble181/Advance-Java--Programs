// change date by 1 day (new method)

import java.time.*;

class change_date_by1_new
{
	public static void main(String args[])
	{
		LocalDate d = LocalDate.now();
		System.out.println("date = " + d);

		d.plusDays(1);				// will not work bcoz time is an immutable class, we need to store it
		System.out.println("date = " + d);
		
		d= d.plusDays(1);
		System.out.println("date = " + d);
			
	}
}
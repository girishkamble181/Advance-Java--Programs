// time and date display 2 using time package

import java.time.*;

class time_date_prog2_timepkg
{
	public static void main(String args[])
	{
		LocalDate d = LocalDate.now();
		System.out.println("date = " + d);

		LocalTime t = LocalTime.now();
		System.out.println("time = " + t);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println("date & time = " + dt);	
	}
}
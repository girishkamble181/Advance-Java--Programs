// date formatting, and find ur age

import java.time.*;
import java.time.format.*;
import java.io.*;

class date_formatting_find_age
{
	public static void main(String args[])
	{
		LocalDate today = LocalDate.now();
		System.out.println(today);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String sdtf = dtf.format(today);
		System.out.println("today = " + sdtf);
	
		Console c = System.console();
		String s = c.readLine("enter ur birthday dd/MM/yyyy ");
		LocalDate bday = LocalDate.parse(s, dtf);
		System.out.println("bday = "+ bday);

		Period p = Period.between(bday, today);
		System.out.println(p);
		System.out.println(p.getYears() + " " + p.getMonths() + " " + p.getDays());
			
	}
}
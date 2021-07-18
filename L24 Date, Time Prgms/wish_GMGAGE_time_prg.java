// wap to wish the user GM/GA/GE

import java.time.*;

class wish_GMGAGE_time_prg
{
	public static void main(String args[])
	{
		LocalTime t = LocalTime.now();
		int h = t.getHour();

		if (h < 12 )
			System.out.println("Good Morning");
		else if(h < 16 )
			System.out.println("Good Afternoon");	
		else
			System.out.println("Good Evening");
	}
}	
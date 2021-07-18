// wap to delete exiting file

import java.io.*;
class delete_exst_file
{
	public static void main(String args[])
	{
		Console c = System.console();
		String filename = c.readLine("enter filename to be deleted ");
		File f = new File(filename);

		if (f.exists())
		{
			f.delete();
			System.out.println(filename + " deleted ");
		}
		else
		{
			System.out.println(filename + " does not exist ");
		}
	}
}
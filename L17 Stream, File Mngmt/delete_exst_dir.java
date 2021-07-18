// wap to delete exiting dir

import java.io.*;
class delete_exst_dir
{
	public static void main(String args[])
	{
		Console c = System.console();
		String dirname = c.readLine("enter dir to be deleted ");
		File d = new File(dirname);

		if (d.exists())
		{
			d.delete();
			System.out.println(dirname + " deleted ");
		}
		else
		{
			System.out.println(dirname + " does not exist ");
		}
	}
}
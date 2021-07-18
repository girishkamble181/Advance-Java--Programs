// wap to create and empty dir(folder)

import java.io.*;
class create_empty_dir
{
	public static void main(String args[])
	{
		Console c = System.console();
		String dirname = c.readLine("enter dir name to be created ");
		File d = new File(dirname);

		if (d.exists())
		{
			System.out.println(dirname + " already exists");
		}
		else
		{
			d.mkdir();
			System.out.println(dirname + " created ");
		}
	}
}
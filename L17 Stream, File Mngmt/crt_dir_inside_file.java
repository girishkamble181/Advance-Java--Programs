// wap to create a dir and file inside that file

import java.io.*;
class crt_dir_inside_file
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
			System.out.println(dirname + " created");
		}

		String filename = c.readLine("enter file name to be created ");
		File f = new File(d,filename);
	
		if (f.exists())
		{
			System.out.println(filename + " already exists");
		}
		else
		{
			try
			{
			f.createNewFile();	
			System.out.println(filename + " created");
			}
			catch(IOException e)
			{
				System.out.println("issue" + e);
			}
		}
	}
}
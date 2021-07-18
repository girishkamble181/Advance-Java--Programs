// wap to create an empty file if it does not exists --> filename would be provided by the user.

import java.io.*;
class create_empty_file_UD
{
	public static void main(String args[])
	{
		Console c = System.console();
		String filename = c.readLine("enter filename to be created ");
		File f = new File(filename);

		if (f.exists())
		{
			System.out.println(filename + " already exists ");
		}
		else	
		{
			try
			{
				f.createNewFile();
				System.out.println(filename + "  created");
			}
			catch(IOException e)
			{
				System.out.println("issue "+ e);
			}
		}
	}
}
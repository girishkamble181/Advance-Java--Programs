// wapt to create a file if it does not exists using nio

import java.io.*;
import java.nio.file.*;

class create_file_nio
{
	public static void main(String args[])
	{
		Console c = System.console();

		String filename = c.readLine("enter filename to be created ");
		Path p = Paths.get(filename);

		if(Files.exists(p))
		{
			System.out.println(filename + " already exists ");	
		}
		else
		{
			try
			{
				Files.createFile(p);
				System.out.println(filename + " created");
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
}
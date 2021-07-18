// wap to delete a file if it exists using nio

import java.io.*;
import java.nio.file.*;

class delete_exst_file_nio
{
	public static void main(String args[])throws IOException
	{
		Console c = System.console();

		String filename = c.readLine("enter filename to be deleted ");
		Path p = Paths.get(filename);

		if(Files.exists(p))
		{
			Files.delete(p);
			System.out.println(filename + " deleted ");	
		}
		else
		{
			System.out.println(filename + " not exists ");
		}
	}
}
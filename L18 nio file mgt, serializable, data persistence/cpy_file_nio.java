// wapt to copy a file if it exists using nio

import java.io.*;
import java.nio.file.*;

class cpy_file_nio
{
	public static void main(String args[])
	{
		Console c = System.console();
		String src_filename = c.readLine("enter source file name ");
		Path src = Paths.get(src_filename);

		if (Files.exists(src))
		{
			String dest_filename = c.readLine("enter dest file name ");
			Path dest = Paths.get(dest_filename);
	
			try
			{
			Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("copy completed ");
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println(src_filename +" does not exists ");
		}

	}
}
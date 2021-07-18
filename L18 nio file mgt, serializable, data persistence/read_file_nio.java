// wap to read from file

import java.io.*;
import java.nio.file.*;

class read_file_nio
{
	public static void main(String args[])throws IOException
	{
		Console c = System.console();

		String filename = c.readLine("enter filename to read from ");
		Path p = Paths.get(filename);

		if(Files.exists(p))
		{
			try(BufferedReader br= Files.newBufferedReader(p);)
			{
				String line = br.readLine();
				while(line != null)
				{
					System.out.println(line);
					line = br.readLine();
				}
					
			}
			catch(IOException e)
			{
				System.out.println("issue "+e);
			}	
		}
		else
		{
			System.out.println(filename + " does not exists ");
		}
	}
}
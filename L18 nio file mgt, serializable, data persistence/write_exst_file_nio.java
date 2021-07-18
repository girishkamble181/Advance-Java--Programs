// wap to write into an existing file

import java.io.*;
import java.nio.file.*;

class write_exst_file_nio
{
	public static void main(String args[])throws IOException
	{
		Console c = System.console();

		String filename = c.readLine("enter filename to write into ");
		Path p = Paths.get(filename);

		if(Files.exists(p))
		{
			try(BufferedWriter bw= Files.newBufferedWriter(p, StandardOpenOption.APPEND);
				PrintWriter pw = new PrintWriter(bw);)
			{
				String data = c.readLine("enter data wo write into ");
				pw.println(data);	
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
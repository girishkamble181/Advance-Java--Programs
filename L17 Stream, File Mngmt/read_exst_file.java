// wap to read from an existing file

import java.io.*;
class read_exst_file
{
	public static void main(String args[])
	{
		Console c = System.console();
		String filename = c.readLine("enter filename to read from ");
		File f = new File(filename);
	
		if (f.exists())
		{
			try( FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);)
			{
				String line = br.readLine();
				while(line != null )
				{
					System.out.println(line);
					line = br.readLine();
				}
			}
			catch(IOException e)
			{
				System.out.println("issue " + e);
			}
		}
		else
		{
			System.out.println(filename + " does not exists ");
		} 
	}
}
	

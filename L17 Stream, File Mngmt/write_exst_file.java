// wap to write into a an existing file

import java.io.*;

class write_exst_file
{
	public static void main(String args[])
	{
		Console c = System.console();
		String filename = c.readLine("enter filename to write into ");
		File f = new File(filename);

		if(f.exists())
		{
			try
			{
				String data= c.readLine("enter data to write ");
				FileWriter fw = new FileWriter(f, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(data);
				pw.close();
			}
			catch(IOException e)
			{
				System.out.println("issue "+ e);
			}
		}
		else
		{
			System.out.println(filename + " does not exists ");
		}
	}
}
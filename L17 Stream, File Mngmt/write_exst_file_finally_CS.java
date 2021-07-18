// wap to write into a an existing file
// using company specific code and using finally

import java.io.*;

class write_exst_file_finally_CS
{
	public static void main(String args[])
	{
		Console c = System.console();
		String filename = c.readLine("enter filename to write into ");
		File f = new File(filename);

		if(f.exists())
		{
			FileWriter fw= null;
			BufferedWriter bw= null;
			PrintWriter pw= null;
			try
			{
				String data= c.readLine("enter data to write ");
				fw = new FileWriter(f, true);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw);
				pw.println(data);			
			}
			catch(IOException e)
			{
				System.out.println("issue "+ e);
			}
			finally
			{
				pw.close();
			}
		}
		else
		{
			System.out.println(filename + " does not exists ");
		}
	}
}
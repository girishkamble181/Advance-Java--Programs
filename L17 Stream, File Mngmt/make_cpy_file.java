// wap to make a copy of a file

import java.io.*;
class make_cpy_file
{
	public static void main(String args[]) throws IOException
	{
		Console c = System.console();		
		String src_filename = c.readLine("enter source filename ");		
		File src = new File(src_filename);
		
		if (src.exists())
		{
			String dest_filename = "copy" + src_filename;
			File dest = new File(dest_filename);
	
			FileReader fr = new FileReader(src);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(dest);
			BufferedWriter bw = new BufferedWriter(fw);	
			PrintWriter pw = new PrintWriter(bw);
			
			String line = br.readLine();	
			while(line != null)
			{
				pw.println(line);
				line = br.readLine();
			}
			br.close();
			pw.close();
			System.out.println("copy completed");
		}
		else
		{
			System.out.println(src_filename + " does not exists ");
		}
		
	}
}
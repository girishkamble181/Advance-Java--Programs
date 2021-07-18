// wap to copy dir containing files

import java.io.*;
class copydir
{
	public static void main(String args[]) throws IOException
	{
		Console c = System.console();

		String src_dirname = c.readLine("enter source dir ");
		File src = new File(src_dirname);

		String dest_dirname = c.readLine("enter dest dir ");
		File dest = new File(dest_dirname);
	
		copy(src, dest);
	}

	public static void copy(File src, File dest) throws IOException
	{
		if (src.isDirectory())
		{
			if(! dest.exists())
			{
				dest.mkdir();
			}
			
			String files[] = src.list();
			for(String file : files)
			{
				File srcfile = new File(src, file);
				File destfile = new File(dest, file);
				copy(srcfile, destfile);
			}
		}
		else
		{
			FileInputStream fr = new FileInputStream(src);
			BufferedInputStream br = new BufferedInputStream(fr);

			FileOutputStream fw = new FileOutputStream(dest);
			BufferedOutputStream bw = new BufferedOutputStream(fw);

			int i = br.read();
			while(i != 1)
			{
					bw.write(i);
					i = br.read();
			}
			br.close();
			bw.close();
			
		}
	}
}
	

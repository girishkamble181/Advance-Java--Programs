// wap to make a copy of a pdf, image, video , audio

import java.io.*;
class mk_cpyOf_pdf_img_file
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
	
			FileInputStream fr = new FileInputStream(src);
			BufferedInputStream br = new BufferedInputStream(fr);
			
			FileOutputStream fw = new FileOutputStream(dest);
			BufferedOutputStream bw = new BufferedOutputStream(fw);	
			
			
			int i = br.read();	
			while(i != -1)
			{
				//System.out.println(i + " bytes ");
				bw.write(i);
				i = br.read();
			}
			br.close();
			bw.close();
			System.out.println("copy completed");
		}
		else
		{
			System.out.println(src_filename + " does not exists ");
		}
		
	}
}
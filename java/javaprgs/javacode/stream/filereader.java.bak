import java.io.*;
class filereader
{
	public static void main(String[] args) 
	{
		try
		{
			File f=new File("badrun.txt");
			FileReader fr=new FileReader(f);
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

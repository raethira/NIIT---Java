import java.io.*;
class filecreate 
{
	public static void main(String[] kat) 
	{
		try
		{
			File f=new File(kat[0]);
			f.createNewFile();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("Hello World!");
	}
}

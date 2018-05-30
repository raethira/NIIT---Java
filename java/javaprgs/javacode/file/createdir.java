import java.io.*;
class createdir 
{
	public static void main(String[] kat) 
	{
		try
		{
			File f=new File(kat[0]);
			f.mkdir();
			//f.mkdirs();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("Hello World!");
	}
}

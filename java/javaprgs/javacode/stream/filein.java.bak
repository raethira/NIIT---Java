import java.io.*;
class filein
{
	public static void main(String[] args) 
	{
		//allocate buffer of 80 bytes
		byte b[]=new byte[180];
		System.out.println("text duisplayed here");
		try
		{
			//open the  file and reading
			FileInputStream fis=new FileInputStream("testin.java");
			//read the 70byte from keyboard
			fis.read(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//assign the contents of buffer
		String str=new String(b);
		System.out.println(str);
		System.out.println("Hello World!");
	}
}

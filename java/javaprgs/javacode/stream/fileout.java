import java.io.*;
class fileout
{
	public static void main(String[] args) 
	{
		//allocate buffer of 80 bytes
		byte b[]=new byte[80];
		System.out.println("text duisplayed here");
		try
		{
			System.in.read(b,0,70);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			//open the  file and reading
			FileOutputStream fos=new FileOutputStream("ccc.java");
			//read the 70byte from keyboard
			fos.write(b,0,70);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		//assign the contents of buffer
		String str=new String(b);
		System.out.println(str);
		System.out.println("Hello World!");
	}
}
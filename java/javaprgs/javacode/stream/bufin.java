import java.io.*;
class bufin
{
	public static void main(String[] args) 
	{
		//allocate buffer of 20 bytes
		byte b[]=new byte[20];
		//System.out.println("text duisplayed here");
		try
		{
			//open the  file and reading
			BufferedInputStream bis=new BufferedInputStream(System.in);
			//read 10 bytes from keyboard
			bis.read(b,0,20);
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

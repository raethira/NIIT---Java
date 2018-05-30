import java.io.*;
class bufout1
{
	public static void main(String args[])
	{
		String str="Creating program";
		byte buffer[]=str.getBytes();
		BufferedOutputStream br=new BufferedOutputStream(System.out);
		try
		{
			br.write(buffer);
			br.flush	 ();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
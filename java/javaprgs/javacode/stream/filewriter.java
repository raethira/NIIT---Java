import java.io.*;
class filewriter
{
	public static void main(String[] args) 
	{
		String str=new String("my cscs name is");
		try
		{
			FileWriter fout=new FileWriter("kat.txt");
			fout.write(str);
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("the String entered is");
		System.out.println(str);
	}
}

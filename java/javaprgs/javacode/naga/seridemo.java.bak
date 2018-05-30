import java.io.*;
class seridemo
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("aaa.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			myclass my=new myclass("naga","1");
			my.writeObject(my);
			my.show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
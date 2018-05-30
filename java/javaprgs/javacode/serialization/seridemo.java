//serialization process
import java.io.*;
class  seridemo
{
	public static void main(String kat[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream(aaa.txt);
			ObjectOutputStream oout=new ObjectOutputStream(fout);
			myclass my=new myclass("kathir","9");
			oout.writeObject(my);
			my.show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

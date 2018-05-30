//serializable object
import java.io.*;
import java.util.*;
class seriobject
{
	public static void main(String[] args) 
	{
		try
		{
		FileOutputStream fout=new FileOutputStream("badrun.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(new String("date"));
		oos.writeObject(new Date());
		oos.flush();
		oos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World!");
	}
}

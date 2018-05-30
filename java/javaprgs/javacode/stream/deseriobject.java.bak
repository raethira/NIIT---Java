//serializable object
import java.io.*;
import java.util.*;
class deseriobject
{
	public static void main(String[] args) 
	{
		try
		{
		FileInputStream fin=new FileInputStream("badrun.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		String str=(String)ois.readObject();
		Date date=(Date)ois.readObject();
		System.out.println(str+" "+date);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World!");
	}
}

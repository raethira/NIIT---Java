//serializable object
import java.io.*;
import java.util.*;
class wriemployee
{
	public static void main(String[] args) 
	{
		employee e=new employee(1001,"kat",8857f);
		try
		{
		FileOutputStream fout=new FileOutputStream("belsi.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(e);
		oos.flush();
		oos.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		System.out.println("Hello World!");
	}
}

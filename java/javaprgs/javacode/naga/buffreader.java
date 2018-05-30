import java.io.*;
class buffreader
{
	public static void main(String args[])
	{
		System.out.println("Please enter a string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String  str=new String();
		try
		{
			str=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("The string entered is:");
		System.out.println(str);
	}
};
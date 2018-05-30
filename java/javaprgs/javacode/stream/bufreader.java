import java.io.*;
class bufreader
{
	public static void main(String[] args) 
	{
		String str=new String();
		try
		{
			System.out.println("Welcomre to all");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			str=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("the String entered is");
		System.out.println(str);
	}
}

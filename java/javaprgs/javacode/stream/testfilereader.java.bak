import java.io.*;
 class  testfilereader
{
	public static void main(String[] args) 
	{
		try
		{	   //already exit file
			File file =new File("badrun.txt");
			//read the file	 by means of character
			FileReader fr=new FileReader(file);
			//loop till end of file
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print(char(i));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		//	e.printStackTrace();
		}
		System.out.println("Hello World!");
	}
}

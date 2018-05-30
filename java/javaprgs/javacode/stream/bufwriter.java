import java.io.*;
class bufwriter
{
	public static void main(String[] args) 
	{
		try
		{
			int ch;
			BufferedWriter bw=new BufferedWriter(new FileWriter("kat.txt"));
			while((ch=System.in.read())!=-1)
			{
				bw.write(ch);
			}
			bw.flush();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Hello World!");
	}
}

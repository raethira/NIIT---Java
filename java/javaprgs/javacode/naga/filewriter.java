import java.io.*;
class filewriter 
{
	public static void main(String[] args) 
	{
		int ch;
		BufferedWriter bw=new BufferedWriter(new FileWriter("buffer.txt"));
		System.out.println("enter text");
		try
		{

			if((ch==System.in.read())==-1)
			{
				bw.write(ch);
			}
//			else
//			{
//				System.out.println("gfhhjjgff");
//			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}

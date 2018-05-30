import java.io.*;
class push
{
	public static void main(String args[]) throws Exception
	{
		String s="if a==b else a=b";
		byte b[]=s.getBytes();
		ByteArrayInputStream bi=new ByteArrayInputStream(b);
		PushbackInputStream p=new PushbackInputStream(bi);
		int c;
		while((c=p.read())!=-1)
		{
			switch(c)
			{
				case '=':
					if((c=p.read())=='=')
					System.out.print(".eq");
					else
					p.unread(c);
					System.out.print((char)c);
					break;
				default:
					System.out.print((char)c);
			}
		}
	}
}
				
	
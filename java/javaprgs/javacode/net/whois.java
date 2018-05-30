import java.net.*;
class whois 
{
	public static void main(String[] args) throws UnknownHostException
	{
		Socket soc=new Socket("localhost",65);
		InputStream in=soc.getInputStream();
		System.out.println(in);
		OutputStream out=soc.getOutputStream();
		System.out.println(out);
	}
}

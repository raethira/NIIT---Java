import java.net.*;
class inetdemo 
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress add=InetAddress.getLocalHost();
		System.out.println(add);
		add=InetAddress.getByName("localhost");
		System.out.println(add);
		System.out.println("Hello World!");
	}
}

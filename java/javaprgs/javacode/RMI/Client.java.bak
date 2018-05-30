import java.rmi.*;
class Client
{
	public static void main(String args[])
	{
		try
		{
			GreetRemote r=(GreetRemote)Naming.lookup("abc");
			System.out.println(r.greet(args[0]);
		}
		catch(exception e)
		{
			System.out.println(e);
		}
	}
}
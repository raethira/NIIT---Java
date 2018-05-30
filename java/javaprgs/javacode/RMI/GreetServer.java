import java.rmi.*;
import java.rmi.server.*;
public class GreetServer extends UnicastRemoteObject implements GreetRemote
{
		public GreetServer()throws RemoteException
	{
	}

public String greet(String s)throws RemoteException
	{
		System.out.println("Welcome to rmi"+s);
		return "Greet to"+s;
	}
	public static void main(String args[])
	{
		try
		{
			GreetServer rem=new GreetServer();
			Naming.rebind("abc",rem);
			System.out.println("Server is ready");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

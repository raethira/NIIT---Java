import java.rmi.*;
import java.rmi.server.*;
public class MultiplicationServer extends UnicastRemoteObject implements Multiplication
{
	public MultiplicationServer() throws RemoteException 
		{
		}
	public double mul(int a1,int b1)throws RemoteException 
		{
		return a1*b1;
		}
			public static void main(String a[]) 
				{
		System.out.println("Server Started");
		try 
			{
			MultiplicationServer mulserver=new MultiplicationServer();
			Naming.rebind("mulp1",mulserver);
		}
		catch(Exception e) 
			{
			System.out.println("ERROR:"+e);
		}
	}
}
			
			
																																   

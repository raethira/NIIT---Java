import java.rmi.RemoteException;
import java.util.*;
import javax.ejb.*;
import javax.naming.*;
import javax.rmi.PortableRemoteObject;

public class CreateClient
{
	public static void main(String arg[])
	{
		try
		{
	HomeCache homeCache = new HomeCache();
	Object obj=homeCache.getHome("TransactionEJBSF2");
			TransactionSFHome home = (TransactionSFHome)PortableRemoteObject.narrow(obj,TransactionSFHome.class);

		TransactionSF rem=home.create();
			for(int i=1;i<=20;i++)
			{
				rem.createCustomer(""+i,i*1000,"Customer"+i);
			}
			System.out.println("Customer  Created");
}
		catch(Exception er)
		{
			System.out.println("Error "+er.getMessage()+" at Client");
		}
	}
}
import java.rmi.*;
public interface GreetRemote extends Remote
{
		public String greet(String s)throws RemoteException;
}

import java.rmi.*;
public interface Multiplication extends Remote {
	public double mul(int a,int b) throws RemoteException; 
	
}

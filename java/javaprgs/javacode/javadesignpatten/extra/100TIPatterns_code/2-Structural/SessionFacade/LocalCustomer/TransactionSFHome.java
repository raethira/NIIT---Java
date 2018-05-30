import javax.ejb.*;
import java.rmi.*;

public interface TransactionSFHome extends EJBHome
{
	public TransactionSF create() throws CreateException, RemoteException;
}
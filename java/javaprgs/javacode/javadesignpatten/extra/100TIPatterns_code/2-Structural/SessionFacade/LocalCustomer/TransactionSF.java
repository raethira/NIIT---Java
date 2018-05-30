import javax.ejb.*;
import java.rmi.*;
import java.util.*;

public interface TransactionSF extends EJBObject
{
 public void createCustomer(String strCustId, double OutStanding, String strCustName)throws RemoteException;
 public void setCustomerOS(String strCustId,double val)throws RemoteException;

}
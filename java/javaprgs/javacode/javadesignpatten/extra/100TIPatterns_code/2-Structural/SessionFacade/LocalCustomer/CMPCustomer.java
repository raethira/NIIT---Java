import java.rmi.RemoteException;
import javax.ejb.*;
public interface CMPCustomer extends EJBLocalObject
{
  public double getOutStanding()throws EJBException;
  public void setOutStanding(double val)throws EJBException;
  public String getCustName()throws EJBException;
  public void setCustName(String val)throws EJBException;
  
}
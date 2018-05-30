import javax.ejb.*;
import java.rmi.*;
import java.util.*;
public interface CMPLocalHome extends EJBLocalHome
{
  public CMPCustomer create(String strCustId, double OutStanding, String strCustName)throws CreateException, EJBException;

  public CMPCustomer findByPrimaryKey(String val) throws FinderException, EJBException;

}
import javax.ejb.*;
import javax.naming.*;
import javax.sql.*;
import java.rmi.*;
import java.util.*;
import java.sql.*;

public class TransactionEJBSF implements SessionBean
{
	private SessionContext ctx;
	public void setSessionContext(SessionContext ctx)
	{
		System.out.println("setSessioContext Called");
		this.ctx = ctx;
	}
	public void ejbPassivate()
	{
		System.out.println("ejbPassivate Called");
	}
	public void ejbActivate()
	{
		System.out.println("ejbActivate Called");
	}
	public void ejbRemove()
	{
		System.out.println("ejbRemove Called");
	}
	public void ejbCreate()
	{
		System.out.println("ejbCreate Called");
	}
  public void createCustomer(String strCustId, double OutStanding, String strCustName)
  {
  try
  		{
			HomeCache homeCache = new HomeCache();
			Object obj=homeCache.getLocalHome("CMPCustEJB2");
			CMPLocalHome home = (CMPLocalHome)obj;

			CMPCustomer rem;
		    	rem = home.create(strCustId,0,strCustName);
			System.out.println("Customer  Created");
		}
		catch(Exception er)
		{
			System.out.println("Error "+er.getMessage()+" at Client");
		}
	}
	  public void setCustomerOS(String strCustId,double val)
	  {
	  
	  		try
	  		{
	  			HomeCache homeCache = new HomeCache();
	  
	  			Object obj = homeCache.getLocalHome("CMPCustEJB2");
	  			CMPLocalHome home = (CMPLocalHome)obj;
	  
	  			CMPCustomer rem=home.findByPrimaryKey(strCustId);
	  			double amt=rem.getOutStanding() ;
	  			System.out.println(rem.getCustName()+" " +amt);
	  			rem.setOutStanding(amt+val);
	  			
	  			System.out.println(rem.getCustName()+" " +rem.getOutStanding() );
	  
	  		}
	  		catch(Exception er)
	  		{
	  			System.out.println("Error "+er+" at Client");
		}
	  }
}
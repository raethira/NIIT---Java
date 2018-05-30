import java.io.*;
import java.util.*;
import javax.ejb.*;
import javax.naming.*;
import javax.sql.*;

public abstract class CMPCustEJB implements EntityBean
{
  private EntityContext ctx;
  public void setEntityContext(EntityContext ctx)
  {
    System.out.println("setEntityContext called");
    this.ctx = ctx;
  }

  public void unsetEntityContext()
  {
    System.out.println("unsetEntityContext ()");
    this.ctx = null;
  }

  abstract public String getCustId();
  abstract public void setCustId(String val);
  abstract public double getOutStanding();
  abstract public void setOutStanding(double val);
  abstract public String getCustName();
  abstract public void setCustName(String val);

  public void ejbActivate()
  {
      System.out.println("ejbActivate ()");
  }

  public void ejbPassivate()
  {
    System.out.println("ejbPassivate ()");
  }

  public void ejbLoad()
  {
    System.out.println("ejbLoad ()");
  }

  public void ejbStore()
  {
    System.out.println("ejbStore ()");
  }

  public void ejbRemove() throws RemoveException
  {
    System.out.println("ejbRemove ()");
  }

  public String ejbCreate(String strCustId, double doubOutStanding, String strCustName)
	throws CreateException
  {
    System.out.println("ejbCreate( PK = " +strCustId + ", " + "OutStanding = $ " +doubOutStanding+ ")");
    setCustId(strCustId);
    setOutStanding(doubOutStanding);
    setCustName(strCustName);
    return null;
  }

  public void ejbPostCreate(String strCustId, double doubOutStanding, String strCustName)
  {
	System.out.println("ejbPostCreate ()");
  }

}
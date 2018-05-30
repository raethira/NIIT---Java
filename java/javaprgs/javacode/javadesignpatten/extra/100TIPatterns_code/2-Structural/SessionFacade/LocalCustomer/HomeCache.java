// helper class.
import javax.ejb.EJBHome;
import javax.ejb.EJBLocalHome;
import javax.naming.*;
import javax.sql.DataSource;

import java.util.Properties;

public class  HomeCache
{
	InitialContext ic;

	public HomeCache()
	{
		try
		{
			Properties prop = new Properties();
			prop.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			prop.put(Context.PROVIDER_URL,"t3://localhost:7001" );
			ic = new InitialContext(prop);
		}
		catch(Exception er)
		{
			System.out.println(er+" at HomeCache()");
		}
	}

	public Object getHome(String strJNDIName)throws Exception
	{
		EJBHome home = null;
		try
		{
			home = (EJBHome)ic.lookup(strJNDIName);
			return home;
		}
		catch(Exception er)
		{
			System.out.println("Exception "+er+" at HomeCache.getHome");
			throw er;
		}
		}
		public Object getLocalHome(String strJNDIName)throws Exception
			{
				EJBLocalHome home = null;
				try
				{
					home = (EJBLocalHome)ic.lookup(strJNDIName);
					return home;
				}
				catch(Exception er)
				{
					System.out.println("Exception "+er+" at HomeCache.getHome");
					throw er;
		}
	}

	public DataSource getDataSource(String strJNDIName)throws Exception
	{
		DataSource ds = null;
		try
		{
			ds = (DataSource)ic.lookup(strJNDIName);
			return ds;
		}
		catch(Exception er)
		{
			System.out.println("Exception "+er+" at HomeCache.getDataSource");
			throw er;
		}
	}
	
		public javax.transaction.UserTransaction getTrans(String strJNDIName)throws Exception
		{
		javax.transaction.UserTransaction utx=null;
			try
			{
				utx=(javax.transaction.UserTransaction)ic.lookup("javax.transaction.UserTransaction");
				return utx;
			}
			catch(Exception er)
			{
				System.out.println("Exception "+er+" at HomeCache.getTrans");
				throw er;
			}
		}

}
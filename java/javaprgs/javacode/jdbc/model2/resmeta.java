import java.sql.*;
class resmeta
{
	public static void main(String kat[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:aaaa","","");
			ResultSetMetaData data=con.getMetaData();
			System.out.println(data.getColumnCount());
			System.out.println(data.getColumnType());
			System.out.println(data.isReadOnly());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

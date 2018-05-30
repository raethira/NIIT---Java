import java.sql.*;
class jdbcmdata
{
	public static void main(String kat[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:aaaa","","");
			DatabaseMetaData data=con.getMetaData();
			ResultSet rs=data.getTable();
			while(rs.next())
			{
				System.out.println(rs.getString());
				con.close();
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

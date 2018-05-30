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
			String aaa[]={"table"};
			ResultSet rs=data.getTables(null,null,null,aaa);
			System.out.println(data.getDriverName());
			System.out.println(data.getDriverVersion());
			System.out.println(data.getURL());

			while(rs.next())
			{
				System.out.println(rs.getString("table_name"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

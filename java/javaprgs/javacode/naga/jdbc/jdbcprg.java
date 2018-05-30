import java.sql.*;
public class jdbcprg 
{
public static void main(String kat[])
{
	try
	{

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:kathir","","");
	Statement sta=con.createStatement();
	ResultSet rs=sta.executeQuery("select * from csctable");
	while(rs.next())
	{
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		System.out.println(rs.getString(5));
		System.out.println(rs.getString(6));
		System.out.println(rs.getString(7));
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
import java.sql.*;
public class jdbcinsert
{
public static void main(String kat[])
{
	try
	{

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:kathir","","");
	String str="update kaka set pid=444";
	Statement sta=con.createStatement();
	sta.executeUpdate(str);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
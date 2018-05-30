import java.sql.*;
public class jdbcinsert
{
public static void main(String kat[])
{
	try
	{

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:kathir","","");
	String str="insert into kaka (pid,pname,padd) values (555,'naga',987)";
	Statement sta=con.createStatement();
	sta.executeUpdate(str);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
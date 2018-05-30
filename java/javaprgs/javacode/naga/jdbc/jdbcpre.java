import java.sql.*;
public class jdbcpre
{
public static void main(String args[])
{
 	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	System.out.println("Loaded Driver");
	Connection con=DriverManager.getConnection("jdbc:odbc:naga"," "," ");
	System.out.println("Connection Established");
	Statement sta=con.createStatement();
	sta.prepareStatement("select * from student where stuid=?");
	sta.setString(1,stuid.getText());
	System.out.println("created statement");
	ResultSet rs=sta.executeQuery();
	System.out.println("Executed Query");
           	}
	catch(Exception e)
	{
	    System.out.println(e.getMessage());
	}
}
}

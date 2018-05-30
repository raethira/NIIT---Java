import java.sql.*;
public class jdbcdemo
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
		System.out.println("created statement");
		ResultSet rs=sta.executeQuery("select * from student");
		System.out.println("Executed Query");
                System.out.println("stuid\tfirstname\tlastname\tstuaddress");
		while(rs.next())
		{ 
		   System.out.print(rs.getString(1)+"\t");
		   System.out.print(rs.getString(2)+"\t");
		   System.out.print(rs.getString(3)+"\t");
		   System.out.print(rs.getString(4)+"\t");
		 }
	}
		catch(Exception e)
		{
		    System.out.println(e.getMessage());
		}
}
}

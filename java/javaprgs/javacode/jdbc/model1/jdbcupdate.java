import java.sql.*;
class jdbcupdate
{
	public static void main(String[] args) 
	{
		try
		{	 //load the driver
			System.out.println("load the driver");
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//create the connection
			System.out.println("create connection");
			Connection con=DriverManager.getConnection("jdbc:odbc:aaaa");
			//create ststement
			System.out.println("creatre statement");
			String str="update emptable set empname='kathir' where empid='1'";
			Statement sta=con.createStatement();
		//update table
		sta.executeUpdate(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Hello World!");
	}
}

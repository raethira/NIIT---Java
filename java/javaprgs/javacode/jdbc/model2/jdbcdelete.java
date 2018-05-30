import java.sql.*;
class jdbcdelete
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
			String str="delete from emptable where empid='1'";
			Statement sta=con.createStatement();
		//delete table
		sta.executeUpdate(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Hello World!");
	}
}

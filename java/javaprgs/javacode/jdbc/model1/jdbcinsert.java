import java.sql.*;
class jdbcinsert
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
			String str="insert into emptable values ('1','naga','987','good')";
			Statement sta=con.createStatement();
		//insert table
		sta.executeUpdate(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Hello World!");
	}
}

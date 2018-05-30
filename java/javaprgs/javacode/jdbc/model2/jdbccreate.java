import java.sql.*;
class jdbccreate
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
			String str="create table emptable (empid integer,empname text,empsalary integer,empnote text(20)) ";
			Statement sta=con.createStatement();
			//create table
			sta.executeUpdate(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Hello World!");
	}
}

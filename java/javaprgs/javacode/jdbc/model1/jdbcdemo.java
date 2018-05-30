import java.sql.*;
class jdbcdemo 
{
	public static void main(String[] args) 
	{
		try
		{	 //load the driver
			System.out.println("load the driver");
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//create the connection
			System.out.println("create connection");
			Connection con=DriverManager.getConnection("jdbc:odbc:aaaa","","");
			//create ststement
			System.out.println("creatre statement");
			Statement sta=con.createStatement();
			//execute query
			System.out.println("Execute statement");
			String str="select * from student";
			ResultSet rs=sta.executeQuery(str);
			System.out.println("retrive the column value");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			System.out.println("Hello World!");
	}
}

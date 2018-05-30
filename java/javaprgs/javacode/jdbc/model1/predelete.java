import java.sql.*;
class predelete
{
	public static void main(String kat[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:aaaa","","");
		String str="delete from student WHERE stuid=?";
		PreparedStatement psta=con.prepareStatement(str);
		psta.setString(1,kat[0]);
		psta.executeUpdate();
		System.out.println("value Deleted");
	 }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

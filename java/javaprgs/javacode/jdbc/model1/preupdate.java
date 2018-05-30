import java.sql.*;
class preupdate 
{
	public static void main(String kat[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:aaaa","","");
		String str="UPDATE student SET stuid=? WHERE stuname=?";
		PreparedStatement psta=con.prepareStatement(str);
		psta.setString(1,kat[0]);
		psta.setString(2,kat[1]);
		psta.executeUpdate();
		System.out.println("value updated");
	 }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

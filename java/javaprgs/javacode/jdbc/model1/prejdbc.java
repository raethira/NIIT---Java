import java.sql.*;
class prejdbc 
{
	public static void main(String kat[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:aaaa","","");
		String str="select * from student where stuid=?";
		PreparedStatement psta=con.prepareStatement(str);
		psta.setString(1,"4");
		//psta.setString(1,kat[0]);
		ResultSet rs=psta.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}
	 }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

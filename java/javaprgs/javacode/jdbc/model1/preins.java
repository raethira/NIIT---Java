import java.sql.*;
class preins 
{
	public static void main(String kat[])
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:aaaa","","");
		String str="insert into student (stuid,stuname,stuadd,stuphone) values(?,?,?,?)";
		PreparedStatement psta=con.prepareStatement(str);
		psta.setString(1,kat[0]);
		psta.setString(2,kat[1]);
		psta.setString(3,kat[2]);
		psta.setString(4,kat[3]);
//		psta.setString(1,"5");
//		psta.setString(2,"ashiya");
//		psta.setString(3,"akak");
//		psta.setString(4,"789");
		psta.executeUpdate();
		System.out.println("value inserted");
	 }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

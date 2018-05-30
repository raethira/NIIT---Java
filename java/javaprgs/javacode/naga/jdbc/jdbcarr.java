import java.sql.*;
public class jdbcarr
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
	System.out.println("stuid\tstuname\t\tstuaddress\tstuphone");
	while(rs.next())
	{
	String str1=rs.getString("stuid"); 
	String str2=rs.getString("stuname");
	String str3=rs.getString("stuadd");
	String str4=rs.getString("stuphone"); 
	System.out.print(str1+"\t");
	if(str2.length() <=15)
	System.out.print(str2+"\t\t");
	if(str3.length() <=15)
	System.out.print(str3+"\t\t");
	System.out.println(str4);
	 }
	}
	catch(Exception e)
	{
	    System.out.println(e.getMessage()); 
	}
}
}

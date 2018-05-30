import java.net.*;
import java.io.*;

public class server
{
	ServerSocket ss;
	Socket s;
	PrintStream out;
	server()
	{	try{
		ss=new ServerSocket(45);
		while(true){
		System.out.println("Server is waiting for the Client");
			s=ss.accept();
			out=new PrintStream(s.getOutputStream());
			   out.println("Hello Client");
		}
				}catch(Exception e){System.out.println(e);}
	}	
	public static void main(String args[])	
	{
		new server();
	}

}



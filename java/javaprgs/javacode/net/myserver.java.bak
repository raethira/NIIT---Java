import java.io.*;
import java.net.*;
import java.awt.*;
public class myserver extends Frame
{
	TextArea txt;
	myserver()
	{
		super("MyServer");
		txt=new TextArea("Status Window");
		add("center",txt);
		pack();
		show();
		ServerSocket sersoc=null;
		Socket soc=null;
		InputStream in=null;
	try
	{
		sersoc=new ServerSocket(1055);
		txt.appendText("Initilaze the port number");
		//lission the port number
		soc=sersoc.accept();
		//connection to be achived client side
		txt.appendText("connectio to client");
		//get the data from socket
		in=soc.getInputStream();
		DataInputStream din=new DataInputStream(in);
		//print the data our status window
		String value=din.readLine();
		txt.appendText("hellow"+value);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	public static void main(String kat[])
	{
		new myserver();
	}
	public boolean handleEvent(Event event)
	{
		if(event.id==Event.WINDOW_DESTROY)
		{
			System.exit(0);
			return true;
		}
		return super.handleEvent(event);
	}
}
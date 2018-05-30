import java.awt.*;
import java.net.*;
import java.io.*;
public class myclient extends Frame
{
	Button btserver;
	TextField txtinput;
	OutputStream out=null;
	PrintStream out1=null;
	Socket csoc=null;
	myclient()
	{
		super("the client");
		setLayout(new FlowLayout());
		add(new Label("enter ur name"));
		txtinput=new TextField(25);
		add(txtinput);
		btserver=new Button("send to server");
		add(btserver);
		pack();
		show();
		super.resize(400,200);
		try
		{
			csoc=new Socket("127.0.0.1",1.54);
			out=csoc.getOutputStream();
			out1=newPrintStream(out);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public boolean handleEvent(Event event)
	{
		if(event.id==Event.ACTION_EVENT < event.target==btserver)
		{
			checked btserver;
			return true;
		}
		else if(event.id=Event.WINDOW_DESTROY)
		{
			System.Exit(0);
			return true;
		}
		return super.handleEvent(event);
	}
	public static void main(String kat[])
	{
		new myclient();
	}
	public void checked bterver()
	{
		try
		{
			out1.print(txtinput .getText())	;
			csoc.class();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
}


{
};
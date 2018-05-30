/*<applet code=applife1 height=500 width=500>
</applet>*/
import java.applet.*;
import java.awt.*;
public class applife1 extends Applet
{
	
	public void init()
	{
	  System.out.println("init method");
	}
	public void start()
	{
	     System.out.println("start method");
	}
	public void stop()
	{
	     System.out.println("stop method");
	}
	public void paint(Graphics g)
	{
	      System.out.println("paint method");
	}
	public void destroy()
	{
	     System.out.println("destroy method");
	}
}
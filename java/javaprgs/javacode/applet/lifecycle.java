//life cycle program
import java.awt.*;
import java.applet.*;
public class  lifecycle extends Applet
{
	public void init()
	{
		System.out.println("init called");
	}
	public void start()
	{
		System.out.println("statr called");
	}
	public void paint(Graphics g)
	{
		g.drawString("hello wlcome to all",100,100);
		showStatus("welcome to my apllet program");
	}
	public void stop()
	{
		System.out.println("stop called");
	}
	public void destroy()
	{
		System.out.println("Destroy called");
	}
}
/*<applet code="lifecycle" height=400 width=400></applet>*/

//life cycle progra
import java.awt.*;
import java.applet.*;
public class  lifecycle1 extends Applet
{
	String str="naga";
	public void init()
	{
		str=str+"init         ";
	}
	public void start()
	{
		str=str+"start             ";
	}
	public void paint(Graphics g)
	{
		str=str+"paint             ";
		g.drawString(str,100,100);
		showStatus("welcome to my apllet program");
	}
	public void stop()
	{
		str=str+"stop           ";
	}
	public void destroy()
	{
		str=str+"destroy       ";
	}
}
/*<applet code="lifecycle1" height=400 width=400></applet>*/

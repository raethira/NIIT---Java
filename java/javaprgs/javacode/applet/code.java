//code and document base program
import java.awt.*;
import java.applet.*;
import java.net.*;
public class  code extends Applet
{
	public void paint(Graphics g)
	{
		URL url=getCodeBase();
		String msg=url.toString();
		g.drawString(msg,25,25);
		URL url1=getDocumentBase();
		String msg1=url1.toString();
		g.drawString(msg1,150,150);
		g.drawString("hello wlcome to all",100,100);
		showStatus("welcome to my apllet program");
	}
}
/*<applet code="code" height=400 width=400></applet>*/

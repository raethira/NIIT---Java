/*<applet code=appdemo1 height=500 width=500>
</applet>*/
import java.applet.*;
import java.awt.*;
public class appdemo1 extends Applet
{
	public void paint(Graphics g)
	{
	     setBackground(Color.red);
	     setForeground(Color.yellow);
	     g.drawString("welcome",100,100);
	      g.drawString("to all",110,110);
	     showStatus("welcome");
	}
}
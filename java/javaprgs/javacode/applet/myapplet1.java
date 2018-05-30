//applet demo program
 import java.applet.*;
 import java.awt.*;
 public class myapplet1 extends Applet
 {
	 public void paint(Graphics g)
	{
		g.drawString("hello wlcome to all",100,100);
		showStatus("welcome to my apllet program");
	}
}
/*<applet code="myapplet1" height=400 width=400></applet>*/

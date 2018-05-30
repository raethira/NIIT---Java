import java.awt.*;
import java.applet.*;
public class  myapplet3 extends Applet
{
	Font f=new Font("Arial",Font.BOLD,30);
	public void paint(Graphics g)
	{
		setForeground(Color.red);
		setBackground(Color.blue);
		g.setFont(f);
		g.drawString("hello wlcome to all",100,100);
		showStatus("Welcome to my applet program");
	}
}
/*<applet code="myapplet3" height=400 width=400></applet>*/

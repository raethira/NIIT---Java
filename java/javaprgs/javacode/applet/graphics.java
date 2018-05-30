//graphics program
import java.awt.*;
import java.applet.*;
public class  graphics extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.blue);
		g.drawString("keep smiling",130,100);
		g.drawOval(60,60,200,200);
		g.fillOval(90,120,50,20);
		g.fillOval(190,120,50,20);
		g.drawLine(165,125,165,175);
		g.drawArc(110,130,95,95,0,-180);
	}
}

/*<applet code="graphics"  height=400 width=400></applet>*/

import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code=key height=500 width=500>
</applet>*/
public class key extends Applet implements KeyListener
{
	String msg=" ";
	public void init()
	{
	  addKeyListener(this);
	}
public void keyPressed(KeyEvent k)
{
	   showStatus("keydown");
	   msg=msg+("keypressed");
	   repaint();
}
public void keyReleased(KeyEvent k)
{
	   showStatus("keyup");
	   msg=msg+("keypressed");
	   repaint();
}
public void keyTyped(KeyEvent k)
{
	   showStatus("type ur text");
	   msg=msg+("keypressed");
	   repaint();
}
public void paint(Graphics g)
{
	g.drawString(msg,100,200);
}
}

 	   
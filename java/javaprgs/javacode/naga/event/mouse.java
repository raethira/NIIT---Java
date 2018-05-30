import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=mouse height=500 width=500>
</applet>*/
public class mouse extends Applet implements MouseListener
{
	String msg=" ";
	public void init()
	{
	    addMouseListener(this);
	    requestFocus();
	}
public void mouseClicked(MouseEvent m)
{
	showStatus("keydown");
	msg=msg+("mouseclicked");
	repaint();
}
public void mousePressed(MouseEvent m)
{
	showStatus("keypressed");
	msg=msg+("mousepressed");
	repaint();
}
public void mouseReleased(MouseEvent m)
{
	showStatus("keyreleased");
	msg=msg+("mousereleased");
	repaint();
}
public void mouseEntered(MouseEvent m)
{
	showStatus("keyentered");
	msg=msg+("mouseentered");
	repaint();
}
public void mouseExited(MouseEvent m)
{
	showStatus("keyexited");
	msg=msg+("mouseexited");
	repaint();
}
public void paint(Graphics g)
{
	g.drawString(msg,100,200);
}
}
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=adaptermouse height=500 width=500>
</applet>*/
public class adaptermouse extends Applet
{
	public void init()
	{
	    addMouseListener(new madapter(this));
	    addMouseMotionListener(new mmadapter(this));
	 }
}
 class madapter extends MouseAdapter
{
	adaptermouse obj=new adaptermouse();
	public madapter(adaptermouse obj)
	{
		this.obj=obj;
	}
	public void mouseClicked(MouseEvent m)
	{
	     obj.showStatus("MouseClicked");
	}
}
 class mmadapter extends MouseMotionAdapter
{
	adaptermouse obj=new adaptermouse();
	public mmadapter(adaptermouse obj)
	{
		this.obj=obj;
	}
	public void mouseDragged(MouseEvent m)
	{
	    obj.showStatus("MouseDragged");
	}
}

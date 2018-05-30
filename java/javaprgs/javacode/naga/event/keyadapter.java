import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=keyadapter height=500 width=500>
</applet>*/
public class keyadapter extends Applet
{
	public void init()
	{
	   addKeyListener(new kadapter(this));
	}
}
class kadapter extends KeyAdapter
{
	keyadapter demo=new keyadapter();
	public kadapter(keyadapter demo)
	{
	    this.demo=demo;
	}
	public void keyReleased(KeyEvent m)
	{
	   demo.showStatus("MouseClicked");
	}
}
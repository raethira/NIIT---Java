import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=jcheck height=500 width=500>
</applet>*/
public class jcheck extends JApplet
{
	public void init()
	{
	    Container contentpane=getContentPane();
	     JCheckbox b;
	     b=new JCheckbox("submit");
	     contentpane.add(b);
	}
}

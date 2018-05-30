import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=jradio height=500 width=500>
</applet>*/
public class jradio extends JApplet
{
	public void init()
	{
	    Container contentpane=getContentPane();
	    JRadioButton b1=new JRadioButton("M");
	    contentpane.add(b1);
	    JRadioButton b2=new JRadioButton("F");
	    contentpane.add(b2);     
	
	}
}

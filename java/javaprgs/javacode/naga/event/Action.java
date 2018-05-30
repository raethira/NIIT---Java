import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code=Action height=500 width=500>
</applet>*/
public class Action extends Applet implements ActionListener
{
	public void init()
	{
	   Button b=new Button("click here");
	   add(b);
	   b.addActionListener(this);
	}
public void actionPerformed(ActionEvent a)
{
	   Button b1=(Button)a.getSource();
	   b1.setLabel("button clicked");
}
}

 	   
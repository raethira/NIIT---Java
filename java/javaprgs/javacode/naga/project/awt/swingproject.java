import javax.swing.*;
import java.applet.*;
import java.awt.*;
/*<applet code=swingproject height=500 width=500>
</applet>*/
public class swingproject extends JApplet
{
	GridLayout g1;
	public void init()
	{
		Container c=getContentPane();
		JLabel l1=new JLabel("Moneysaver Corporation");
	 	JLabel l2=new JLabel();
		JLabel l3=new JLabel("Name");
		JLabel l4=new JLabel("E-Mail Address");
		JLabel l5=new JLabel("Subject");
		JLabel l6=new JLabel("Message");
		
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField("FeedBack");
		
		JTextArea t4=new JTextArea("Type Your Message Here",4,4);
		
		JButton b1=new JButton("SUBMIT");
		JButton b2=new JButton("CANCEL");
		
		g1=new GridLayout(6,2);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(t1);
		c.add(l4);
		c.add(t2);
		c.add(l5);
		c.add(t3);
		c.add(l6);
		c.add(t4);
		c.add(b1);
		c.add(b2);
	}
}

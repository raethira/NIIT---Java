import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=swing1 height=500 width=500>
</applet>*/
public class swing1 extends JApplet implements ActionListener
{
	
	JButton b1;
	JButton b2;
	public void init()
	{
		Container con=getContentPane();
		con.setLayout(new FlowLayout());
		b1=new JButton("swing Component");
		b2=new JButton("awtbutton");
		//b1.setMnemonic("s");
		//b1.setToolTipText("this is swing button");
		con.add(b1);
		con.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	JOptionPane.showMessageDialog(this,"swing button clicked");
	else
	JOptionPane.showMessageDialog(this,"awt button clicked");
}
}
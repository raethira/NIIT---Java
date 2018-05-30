import javax.swing.*;
import java.awt.*;
public class bankswing
{
	static JFrame frame;
	static JPanel panel;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3;
	JTextArea t4;
	JButton b1,b2;
	GridLayout g1;
	public bankswing()
	{
	g1=new GridLayout(2,2);
	panel=new JPanel();
	frame=new JFrame("MyName");
	panel.setLayout(new 
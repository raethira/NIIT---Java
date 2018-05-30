import java.awt.*;
public class login extends Frame
{
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2;
	login()
	{
		super("Login success");
		setLayout(new FlowLayout());
		b1=new Button("submit");
		b2=new Button("cancel");
		t1=new TextField(20);
		t2=new TextField(20);
		l1=new Label("username");
		l2=new Label("password");
		Panel p1=new Panel();
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		Panel p2=new Panel();
		p2.add(b1);
		p2.add(b2);
		add(p1,null);
		add(p2,null);
	}
public static void main(String args[])
{
	login l=new login();
	l.setSize(300,300);
	l.setVisible(true);
}
}
	
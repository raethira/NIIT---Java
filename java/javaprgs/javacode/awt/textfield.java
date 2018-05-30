import java.awt.*;
import java.applet.*;
/*<applet code="textfield" height=400 width=400></applet>*/
public class textfield  extends Applet
{	 
	public void init()
	{
		TextField t1=new TextField();
		TextField t2=new TextField("CSC");
		TextField t3=new TextField("COMPUTER",50);
		TextField t4=new TextField(5);
		t1.setText("wetcome");
		System.out.println(t3.getText());
		System.out.println(t3.getColumns());
		System.out.println(t1);
		System.out.println(t3.echoCharIsSet());
		t4.setEchoChar('t');
		System.out.println(t4.getEchoChar());
		add(t1);
		add(t2);
		add(t3);
		add(t4);
	}
}


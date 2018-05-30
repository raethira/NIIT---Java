import java.awt.*;
import java.applet.*;
/*<applet code="flow" height=400 width=400></applet>*/
public class flow  extends Applet
{
	public void init()
	{
		setLayout(new FlowLayout());
		Label l1=new Label("kala");
		Label l2=new Label("CSC");
		Label l3=new Label("COMPUTER",Label.LEFT);
		Label l4=new Label("lalala");
		Label l5=new Label("dasd");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
 	}
}


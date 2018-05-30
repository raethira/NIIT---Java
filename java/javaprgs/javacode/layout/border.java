import java.awt.*;
import java.applet.*;
/*<applet code="border" height=400 width=400></applet>*/
public class border  extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		Label l1=new Label("kala");
		Label l2=new Label("CSC");
		Label l3=new Label("COMPUTER");
		Label l4=new Label("lalala");
		Label l5=new Label("dasd");
		add(l1,BorderLayout.NORTH);
		add(l2,BorderLayout.EAST);
		add(l3,BorderLayout.WEST);
		add(l4,BorderLayout.SOUTH);
		add(l5,BorderLayout.CENTER);
 	}
}


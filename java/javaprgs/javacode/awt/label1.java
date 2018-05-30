import java.awt.*;
import java.applet.*;
/*<applet code="label1" height=400 width=400></applet>*/
public class label1  extends Applet
{
	public void paint(Graphics g)
	{
		Label l1=new Label();
		Label l2=new Label("CSC");
		Label l3=new Label("COMPUTER",Label.LEFT);
		l1.setText("welcome");
		g.drawString(l3.getText(),100,200);
		g.drawString(""+l3.getAlignment(),200,150);
		g.drawString(""+l1,50,50);
		add(l1);
		add(l2);
		add(l3);
	}
}


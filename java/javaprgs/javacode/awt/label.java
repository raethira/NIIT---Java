import java.awt.*;
import java.applet.*;
/*<applet code="label" height=400 width=400></applet>*/
public class label  extends Applet
{	 
	public void init()
	{
		Label l1=new Label();
		Label l2=new Label("CSC");
		Label l3=new Label("COMPUTER",Label.LEFT);
		l1.setText("welcome");
		System.out.println(l3.getText());
		System.out.println(l3.getAlignment());
		System.out.println(l1);
		add(l1);
		add(l2);
		add(l3);
	}
}


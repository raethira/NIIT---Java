import java.awt.*;
import java.applet.*;
/*<applet code="textarea" height=400 width=400></applet>*/
public class textarea  extends Applet
{	 
	public void init()
	{
		TextArea t1=new TextArea();
		TextArea t2=new TextArea("CSC");
		TextArea t3=new TextArea("COMPUTER",5,5);
		TextArea t4=new TextArea(10,10);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		t1.setText("wetcome");
		System.out.println(t3.getText());
		System.out.println(t3.getColumns());
		System.out.println(t3.getRows());
		System.out.println(t1);
		t3.append("kalai");
		t4.insert("kalai",3);	 

	}
}


import java.awt.*;
import java.applet.*;
/*<applet code="list" height=400 width=400></applet>*/
public class list  extends Applet
{	 
	public void init()
	{
		List t1=new List(5,true);
		t1.add("csc");
		t1.add("csc");
		t1.add("csc");
		t1.add("csc");
		add(t1);
	}
}


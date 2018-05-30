import java.awt.*;
import java.applet.*;
/*<applet code="check" height=400 width=400></applet>*/
public class check  extends Applet
{	 
	public void init()
	{
		Checkbox t1=new Checkbox();
		Checkbox t2=new Checkbox("CSC",true);
		add(t1);
		add(t2);
	}
}


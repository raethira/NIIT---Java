import java.awt.*;
import java.applet.*;
/*<applet code="radio" height=400 width=400></applet>*/
public class radio  extends Applet
{	 
	public void init()
	{
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox t1=new Checkbox("degree",cg,true);
		Checkbox t2=new Checkbox("CSC",cg,false);
		add(t1);
		add(t2);
	}
}


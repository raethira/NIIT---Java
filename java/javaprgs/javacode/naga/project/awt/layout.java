import java.applet.*;
import java.awt.*;
/*<applet code=layout height=500 width=500>
</applet>*/
public class layout extends Applet
{
	public void init()
	{
	setLayout(new GridLayout(2,3));
	Button a,b,c,d,e,f;
	a=new Button("add");
	b=new Button("sub");
	c=new Button("mul");
	d=new Button("div");
	e=new Button("mod");
	f=new Button("per");
	add(a);
	add(b);
	add(c);
	add(d);
	add(e);
	add(f);
	}
}
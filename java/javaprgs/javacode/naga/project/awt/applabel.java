import java.applet.*;
import java.awt.*;
/*<applet code=applabel height=500 width=500>
</applet>*/
public class applabel extends Applet
{
	int i,j;
	public void init()
	{
	     TextArea t1=new TextArea();
	     TextArea t2=new TextArea("pavani");     
	     TextArea t3=new TextArea("pavani",7,15);
	      TextArea t4=new TextArea("kala",5,8,7);
	      add(t1);
	      add(t2);
	      add(t3);
	      add(t4);
     	}
	public void paint(Graphics g)
	{
		g.drawString("getalignment"+i,100,200);
	}
}
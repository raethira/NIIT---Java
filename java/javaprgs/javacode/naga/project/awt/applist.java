import java.applet.*;
import java.awt.*;
/*<applet code=applist height=500 width=500>
</applet>*/
public class applist extends Applet
{
	int i,j;
	public void init()
	{
	      List t1=new List(); 	
	      List t2=new List(5,true);
	      add(t2);
	      add(t1);
     	     CheckboxGroup cg=new CheckboxGroup(); 
	     Checkbox c1=new Checkbox("female",cg,false);
	     Checkbox c2=new Checkbox("male",cg,true);
	     add(c1);
	     add(c2);
	    
	}

	public void paint(Graphics g)
	{
		g.drawString("getalignment"+i,100,200);
	}
}
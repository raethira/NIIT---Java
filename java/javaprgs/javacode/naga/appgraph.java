import java.applet.*;
import java.awt.*;
/*<applet code=appgraph height=500 width=500>
</applet>*/
public class appgraph extends Applet
{
	int n=5;
	public void paint(Graphics g)
	{
	       int a={50,100,150,200,250};
	       int b={100,150,200,250,200};
	      g.drawPolygon(a, b, n);
	     // g.fillPolygon(int[], int[], int);
	}
}
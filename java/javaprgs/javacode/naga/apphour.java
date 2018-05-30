import java.applet.*;
import java.awt.*;
/*<applet code="apphour" height=500 width=500>
</applet>*/
public class apphour extends Applet
{
	int num=5;
	public void paint(Graphics g)
	{
	     int xpoints[]={30,200,30,200,30};
	     int ypoints[]={30,30,200,200,30};
	     g.drawPolygon(xpoints,ypoints,num);
	}
}
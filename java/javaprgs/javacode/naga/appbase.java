/*<applet code=appbase height=500 width=500>
</applet>*/
import java.applet.*;
import java.awt.*;
import java.net.*;
public class appbase extends Applet
{
	public void paint(Graphics g)
	{
		String str,str1;
		URL url=getCodeBase();
		str=url.toString();
		URL url1=getDocumentBase();
		str1=url1.toString();
		g.drawString(str,100,100);
		g.drawString(str1,110,110);
	}
}
	
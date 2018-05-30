import java.applet.*;
import java.awt.*;
import java.net.*;
import java.lang.*;
/*<applet code=appparademo height=400 width=400>
 <param name=name value="naga">
 <param name=cla value="bsc">
 <param name=phone value="5234">
 <param name=sale value="12.4">
 </applet>*/
public class appparademo extends Applet
{
	int phone;
	float sale;
	String name,cla,str;
	public void init()
	{
	     name=getParameter("name");
	     cla=getParameter("cla");
	     str=getParameter("phone");
	     phone=Integer.parseInt(str);
	     str=getParameter("sale");
	     sale=Float.parseFloat(str);

	}
	public void paint(Graphics g)
	{
	     g.drawString("name"+name,10,20);
	     g.drawString("cla"+cla,10,30);
	     g.drawString("phone"+phone,10,40);
	     g.drawString("sale"+sale,10,50);
	}
}

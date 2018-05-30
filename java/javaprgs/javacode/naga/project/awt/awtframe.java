import java.awt.*;
import java.applet.*;
class awtframe 
{
	awtframe()
	{
	Frame f=new Frame("aaaa");
	Panel p=new Panel();
	f.setVisible(true);
	f.setSize(400,400);
	f.setBackground(Color.gray);
	
	List l1=new List(6);	
	l1.add("aaa");
	l1.add("bbb");
	l1.add("ccc");
	l1.add("ddd");
	l1.add("eee");

	Choice c=new Choice();
	c.addItem("naga");
	c.addItem("uma");
	c.addItem("siva");
	c.addItem("raja");
	
	
	p.add(l1);
	p.add(c);
	
	f.add(p);
	}
}
class awtframedemo extends Franme
{
public static void main(String kat[])
{
	awtframe obj1=new awtframe();
	obj1.awtframe();
}
}	
                                                                                                             
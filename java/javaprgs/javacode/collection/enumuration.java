import java.util.*;
class enumuration
{
	public static void main(String[] args) 
	{
		Vector al=new Vector();
		System.out.println(al.size());
		System.out.println(al);
		al.addElement("a");
		al.addElement("z");
		al.addElement("c");
		al.addElement("b");
		al.addElement("r");
		al.addElement(new Integer(2));
		al.addElement(new Float(34f));
		al.addElement(new Double(34.5));
		System.out.println(al);
		System.out.println("Hello World!");
		Enumeration  e=al.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}

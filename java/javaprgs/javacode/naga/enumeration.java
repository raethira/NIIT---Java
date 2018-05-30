import java.util.*;
class enumeration
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		System.out.println(v.size());
		System.out.println(v);
		v.addElement("n");
		v.addElement("a");
		v.addElement("g");
		v.addElement("a");
		System.out.println(v);
		System.out.println("HELLO WORLD");
		Enumeration e=v.elements();
		while(e.hasMoreElements());
		{
			System.out.println(e.nextElement());
		}
	}
}
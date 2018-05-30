import java.util.*;
class vector
{
	public static void main(String[] args) 
	{
		Vector al=new Vector();
		System.out.println(al.size());
		System.out.println(al);
		al.addElement("a");
		al.addElement("z");
		al.addElement("c");
		al.addElement("9");
		al.addElement("b");
		al.addElement("r");
		al.addElement(new Integer(2));
		al.addElement(new Float(34f));
		al.addElement(new Double(34.5));
		al.add(1,"l");
		System.out.println(al.size());
		System.out.println(al);
		System.out.println("Hello World!");
		System.out.println(al.capacity());
		
	}
}

import java.util.*;
class properties
{
	public static void main(String[] args) 
	{
		Properties al=new Properties();
		System.out.println(al.size());
		System.out.println(al);
		al.put("a");
		al.put("z");
		al.put("c");
		al.put("b");
		al.put("r");
		al.put(new Integer(2));
		al.put(new Float(34f));
		al.put(new Double(34.5));
		System.out.println(al.size());
		System.out.println(al);
		System.out.println("Hello World!");
	}
}

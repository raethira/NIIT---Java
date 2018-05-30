import java.util.*;
class iterator
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		System.out.println(al);
		al.add("n");
		al.add("a");
		al.add("g");
		al.add("a");
		Iterator i=al.iterator();
		while(i.hasNext())
		{	
			String element=(String)i.next();
			System.out.println(element);
		}
	}
}

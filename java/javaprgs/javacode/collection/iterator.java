 import java.util.*;
class iterator
{
	public static void main(String[] args) 
	{
		LinkedList al=new LinkedList();
		System.out.println(al.size());
		System.out.println(al);
		al.add("z");
		al.add("m");
		al.add("c");
		al.add("a");
		al.add("1");
		al.add("9");
		al.add("abn");
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object element=i.next();
			System.out.println(element);
		}
	}
}

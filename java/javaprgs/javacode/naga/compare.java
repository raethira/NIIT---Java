import java.util.*;
class comparat implements Comparator

{
	public static void main(String args[])
	{
		TreeSet t=new TreeSet(new comparat());
{
	public int compare(Object a,Object b)
	{
		String str,str1;
		str=(String)a;
		str1=(String)b;
		return str.compareTo(str1);
	}
}
class compare		System.out.println(t.size());
		System.out.println(t);
		t.add("n");
		t.add("a");
		t.add("g");
		t.add("a");
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			Object element=i.next();
			System.out.println(element);
		}
	}
}

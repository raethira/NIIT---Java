import java.util.*;
class mycomp implements Comparator
{
	public int compare(Object a,Object b)
	{
		String astr,bstr;
		astr=(String)a;
		bstr=(String)b;
		return bstr.compareTo(astr);
	}
}

class comparator
{
	public static void main(String[] args) 
	{
		TreeSet al=new TreeSet(new mycomp());
		System.out.println(al.size());
		System.out.println(al);
		al.add("c");
		al.add("a");
		al.add("b");
		al.add("e");
		al.add("f");
		al.add("d");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object element=i.next();
			System.out.println(element);
		}
	}
}

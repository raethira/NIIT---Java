import java.util.*;
class treemap //sort the keys
{
	public static void main(String[] args) 
	{
		TreeMap al=new TreeMap();
		System.out.println(al.size());
		System.out.println(al);
		//put element to the map
		al.put("kathir",new Double(535.88));
		al.put("niit",new Double(535.88));
		al.put("ram",new Double(535.88));
		al.put("csc",new Integer(535));
		//get element to the map
		Set set=al.entrySet();
		//get an iterator
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey());
			//System.out.println(me.getValue());
		}
		System.out.println(al.size());
		System.out.println(set);
		System.out.println("Hello World!");
	}
}

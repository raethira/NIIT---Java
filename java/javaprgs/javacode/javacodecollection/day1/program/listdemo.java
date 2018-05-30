import java.util.*;
class listdemo
{
	public static void main(String[] args) 
	{
		List li=new ArrayList();
		li.add("a");
		li.add("v");
		li.add("hdzcfdsfsdfsdfdz");
		li.add("");
		li.add("");
		li.add("1");
		li.add("m");
		li.add("i");
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		System.out.println(li.contains("m"));
		System.out.println(li.containsAll(li));
		System.out.println(li.addAll(li));
		System.out.println(li.hashCode());
		System.out.println(li.get(2));
		System.out.println(li.indexOf(2));
		System.out.println(li.subList(2,7));
		System.out.println("Hello World!");
	}
}

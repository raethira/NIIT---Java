import java.util.*;
class arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
                               System.out.println(al.size());
		System.out.println(al);
		al.add("a");
		al.add("z");
		al.add("c");
		al.add("b");
		al.add("1");
		al.add("ka");
		System.out.println(al.indexOf("1"));
		System.out.println(al.size());
		System.out.println(al);
		System.out.println("Hello World!");
		System.out.println(al.remove("ka"));
		System.out.println(al);
	}
}

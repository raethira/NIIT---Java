import java.util.*;
class linkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList al=new LinkedList();
		System.out.println(al.size());
		System.out.println(al);
		al.add("a");
		al.add("9");
		al.add("x");
		al.add("b");
		al.add("1");
		System.out.println(al.size());
		System.out.println(al);
		System.out.println("Hello World!");
		al.removeFirst();
		al.removeLast();
		System.out.println(al);
	}
}

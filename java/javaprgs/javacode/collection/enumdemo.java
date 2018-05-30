import java.util.*;
class enumdemo
{
	public static void main(String[] args) 
	{
		Hashtable al=new Hashtable();
		System.out.println(al.size());
		System.out.println(al);
		al.put("z","a");
		al.put("m","n");
		al.put("c","b");
		al.put("a","w");
		al.put("1","t");
		al.put("9","l");
		al.put("a","u");
		Enumeration  e=al.keys();
		while(e.hasMoreElements())
		{
			String str=(String)e.nextElement();
			System.out.println(str+":"+al.get(str));
		}
		System.out.println("Hello World!");
	}
}

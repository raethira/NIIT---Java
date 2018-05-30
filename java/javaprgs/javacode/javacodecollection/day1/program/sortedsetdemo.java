import java.util.*;
class sortedsetdemo 
{
	public static void main(String[] args) 
	{
		SortedSet s=new TreeSet();
		s.add("sddcsdsd");
		s.add("nsddcsdsd");
		s.add("vsddcsdsd");
		s.add("asddcsdsd");
		s.add("esddcsdsd");
		s.add("ysddcsdsd");
		System.out.println(s);
		SortedSet s1=s.subSet("nsddcsdsd","esddcsdsd");
		System.out.println(s1);
		System.out.println("Hello World!");
	}
}

 import java.io.*;
class demo
{
	public static void main(String args[]) throws IOException
	{
		int a,b,c;
	      	DataInputStream i=new DataInputStream(System.in);
	      	System.out.println("enter the value for a");
		a=Integer.parseInt(i.readLine());
		System.out.println("enter the value for b");
		b=Integer.parseInt(i.readLine());
		void dis(int aa,int bb)
		{
			a=aa;
			b=bb;
			System.out.println("a="+a+"b="+b);
		}
		void add()
		{
			c=a+b;
			System.out.println("addition is="+c);
		}
	}
}
class naga
{
	public static void main(String args[])
	{
	   	demo d=new demo();
		d.dis();
		d.add();
	}
}
import java.io.*;
class A implements Serializable
{
	int a,b;
	String c;
	A(int aa,int bb)
	{
		a=aa;
		b=bb;
		
	}
	public String toString()
	{
		return "a="+a+"b="+b;
	}
}
class c
{
	public static void main(String args[]) throws Exception
	{
	         	A b=new A(10,20);
	         	FileOutputStream f=new FileOutputStream("c:/4990/naga/p.txt");
	         	ObjectOutputStream o1=new ObjectOutputStream(f);
	          	o1.writeObject(b);
	          	o1.flush();
	          	o1.close();
	
	
		A d;
		FileInputStream f1=new FileInputStream("c:/4990/naga/p.txt");
		ObjectInputStream o2=new ObjectInputStream(f1);
		d=(A)o2.readObject();
		System.out.println(d);
	}
}
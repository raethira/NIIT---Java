import java.io.*;
class A
{
	int a,b;
	A(int aa,int bb)
	{
		a=aa;
		b=bb;
	}
	public String toString()
	{
		System.out.println("addition is="+(a+b));
	}
}
class c
{
	public static void main(String args[]) throws IOException
	{
	         	A b=new A(10,20);
	         	FileOutputStream f=new FileOutputStream("c:/4990/naga/p.txt);
	         	ObjectOutputStream 01=new ObjectOutputStream(f);
	          	o1.writeObject(b);
	          	o1.flush();
	          	o1.close();
	
	
		A d;
		FileInputStream f1=new FileInputStream("c:/4990/naga/p.txt);
		ObjectInputStream o2=new ObjectInputStream(f1);
		d=(A)o2.readObject();
		System.out.println(d);
	}
}
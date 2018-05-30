class A 
{
	public void call()
	{
		System.out.println("First staement");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Second statement");
	}
}
class B extends Thread
{
	A t;
	public B(A t)
	{
		this.t=t;
	}
	public void run()
	{
		t.call();
	}
}
public class nonsyn
{
	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B(a);
		B c=new B(a);
		b.start();
		c.start();
		System.out.println("Hello World!");
	}
}

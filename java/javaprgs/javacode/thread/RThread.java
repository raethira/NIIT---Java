class A implements Runnable 
{
	Thread  t;
	A()
	{
		t=new Thread(this,"child thraddemo");
		System.out.println(t);
	}
	public void run()
	{}
}
class RThread
{
	public static void main(String[] args) 
	{
		new A();
		System.out.println("main thread started");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception  e)
		{
			System.out.println(e);
		}
		System.out.println("Welcome to my Thread");
	}
}

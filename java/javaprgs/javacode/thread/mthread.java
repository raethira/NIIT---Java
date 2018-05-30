//creating multiu thread
class A
{
	String str;
	A(String str)
	{
		this.str=str;
		Thread t=new Thread();
		System.out.println("child thread created");
		System.out.println(t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(str+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}}
}
class mthread
{
	public static void main(String[] args) 
	{
		new A("aaaa");
		new A("bbb");
		System.out.println("Main thread");
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
			catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World!");
	}
}

class thread extends Thread 
{
	thread()
	{
		System.out.printf("hai hello");
		start();
	}
	public void run()
	{
		System.out.println("Children thread executed");
	}
}
class CThread
{
	public static void main(String[] args) 
	{
		thread obj=new thread();
		System.out.println("main thread started");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World!");
	}
}

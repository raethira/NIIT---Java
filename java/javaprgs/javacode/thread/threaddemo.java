class threaddemo 
{
	public static void main(String[] args) 
	{
		Thread t=new Thread();
		System.out.println(t);
		t.setName("Naga");
		System.out.println("now thread name is "+t);
		try
		{
			t.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Exceptuion occured");
			System.out.println(e);
		}
		System.out.println("Hello World!");	
	}
}

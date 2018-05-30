class throwdemo1
{
	static void throwDemo()
	{
		try
		{
			throw new IllegalStateException("My exception");
		}
		catch(IllegalStateException obj)
		{
			System.out.println("Caught:"+obj);
		}
	}
	public static void main(String args[])
	{
		throwDemo();
	}
}



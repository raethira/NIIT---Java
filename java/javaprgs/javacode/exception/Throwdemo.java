class Throwdemo
{
	static void throwDemo()
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(NullPointerException obj)
		{
			System.out.println("Not caught by catch block inside throwDemo()");
		}
	}
	public static void main(String args[])
	{
		try
		{
			throwDemo();
		}
		catch(ArithmeticException obj1)
		{
			System.out.println("Exception caught in:"+obj1);
		}
	}

}
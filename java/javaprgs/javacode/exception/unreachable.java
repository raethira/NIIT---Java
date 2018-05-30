class unreachable
{
	public static void main(String[] args) 
	{
		int i1=0,i2=20,i3;
		try
		{
			i3=i2/i1;
			System.out.println(i3);
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}

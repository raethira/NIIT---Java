class printstack
{
	public static void main(String[] args) 
	{
		int i1=0,i2=20,i3;
		int A[]={1,3},result;
		try
		{
			i3=i2/i1;
			System.out.println(i3);
			result=i2/A[4];
			System.out.println(result);
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
	}
}

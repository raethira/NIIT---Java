class finalydemo
{
	public static void main(String[] args) 
	{
		int A[]={1,2,3};
		int i1=10,i2=20,i3,result;
		try
		{
			//result=i2/A[4];
			//System.out.println(result);
			i3=i2/i1;
			System.out.println(i3);
		}
		/*catch(Exception e)
		{
			System.out.println("Welcome to my Exception");
		}*/	
		finally
		{
			System.out.println("Welcome to my Exception");
		}			
		
	}
}

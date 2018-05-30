class multicatch
{
	public static void main(String[] args) 
	{
		int A[]={1,2,3};
		int i1=10,i2=20,i3,result;
		try
		{
			result=i2/A[4];
			System.out.println(result);
			i3=i2/i1;
			System.out.println(i3);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arry index outof bounds Exception ");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Arithmetic exception ");
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
	}
}

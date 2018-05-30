class callbyvalue 
{
	void calling()
	{
		int value=5;
		System.out.println(value);
		called(value);
		System.out.println(value);
	}
	void called(int value1)
	{
		value1=10;
	}
}
class callbyvaluedemo
{
	public static void main(String kat[])
	{
		callbyvalue obj=new callbyvalue();
		obj.calling();
	}
}
class A
{ 
	public void add(int i,int j)
	{
		int k=i+j;
		System.out.println(k);
	}
}
class B	 extends A
{
	public void add(int i,int j)
	{
		int k=i-j;
		System.out.println(k);
	}
}
class inhdemoprg1
{
	public static void main(String kat[])
	{
		B b=new B();
		b.add(10,20);
		
	}
}

class A
{
	int i,j;
	public int add(int i,int j)
	{
		this.i=i;
		this.j=j;
		return i+j;
	}
}
class B	extends A
{
	int k,l;
	public int add(int i,int j,int k,int l)
	{
		super.i=i;
		super.j=j;
		this.k=k;
		this.l=l;
		return i+j+k+l;
	}
}
class supdemo
{
	public static void main(String kat[])
	{
		A a=new A();
		System.out.println(a.add(10,20));
		B b=new B();
		System.out.println(b.add(10,20,10,20));
	}
}

class A
{
	public void add(int i,int j)
	{
		int k=i+j;
		System.out.println(k);
	}
}
class B extends A
{
	public void add(int i,int j)
	{
		super.add(30,40);
		int k=i-j;
		System.out.println(k);
	}
}
class C extends B
{
	public void add(int i,int j)
	{
		super.add(10,20);
		int k=i*j;
		System.out.println(k);
	}
}
class overdemo
{
	public static void main(String kat[])
	{
		A a=new A();
		B b=new B();
		C c=new C();
		A r;
		r=a;
		r.add(10,20);
		r=b;
		r.add(20,50);
		r=c;
		r.add(20,40);
	}
}

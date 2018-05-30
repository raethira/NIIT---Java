class test
{
	int i,j;
	test(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	void meth(test t)
	{
		t.i=i*2;
		t.j=j/2;
	}
}
class callbyref 
{
	public static void main(String[] args) 
	{
		test obj=new test(10,20);
		System.out.println("before call"+obj.i+obj.j);
		obj.meth(obj);
		System.out.println("after call"+obj.i+obj.j);
		System.out.println("Hello World!");
	}
}

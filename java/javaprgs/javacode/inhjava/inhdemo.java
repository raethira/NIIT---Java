class A
{
	int i,j;
	void show()
	{
		System.out.println("i and j"+i+" "+j);
	}
}
class B	extends A
{
	int k;
	void showk()
	{
		System.out.println("k"+k);
	}
	void sum()
	{
		System.out.println("i+j+k"+(i+j+k));
	}
}
	class inhdemo
	{
		public static void main(String args[])
		{
			A obj=new A();
			B obj1=new B();
			obj.i=10;
			obj.j=20;
			obj.show();
			System.out.println();
			obj1.i=29;
			obj1.j=56;
			obj1.k=5;
			obj1.showk();
			obj1.show();
			System.out.print("Sum is");
			obj1.sum();
		}
	}
	
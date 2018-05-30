abstract class A
{
	abstract void call1();	//declare
	public void call2()	//define
	{
		System.out.println("call2 called");
	}
}
class B extends A
{
	public void call1()
	{
		System.out.println("call1 called");
	}	 
	public void call3()
	{
		System.out.println("call3 called");
	}
}
class absdemo 
{
	public static void main(String kat[])
	{
		B b=new B();
		b.call1();
		b.call2();
		b.call3();
	}
}

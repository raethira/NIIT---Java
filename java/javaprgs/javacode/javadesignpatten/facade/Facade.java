class A
{
	public A(int x)
	{
      System.out.println(" from A  "+x);
	}
}
class B
{
	public B(long x)
	{
	System.out.println(" from B  "+x);
	}
}
class C
{
	public C(double x)
	{
	System.out.println(" from C  "+x);
	}
}


public class Facade
{
  static A makeA(int x)
  {
	  return new A(x);
   }
  static B makeB(long x)
  {
	  return new B(x);
   }
  static C makeC(double x)
  {
	  return new C(x);
   }
  public void test()
  {

    A a = Facade.makeA(5);
    B b = Facade.makeB(10);
    C c = Facade.makeC(1.0);
  }
  public static void main(String args[])
  {
     Facade f1 =new Facade();
      f1.test();

  }
}
class naga
{
	void naga(uma o)
	{
		o.a=o.a+10;
		o.b=o.b+10;
		System.out.println("inside a o.a="+o.a+"o.b"+o.b);
	}
}
class uma
{
	int a=30,b=40;
	void uma()
	{
		System.out.println("inside uma a="+a+"b="+b);
	}
}
class lori
{
	public static void main(String args[])
	{
		naga n=new naga();
		uma u=new uma();
		n.naga(u);
		u.uma();
	}
} 
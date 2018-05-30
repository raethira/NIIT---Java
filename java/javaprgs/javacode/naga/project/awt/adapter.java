interface i1
{
public void add();
}
interface i2
{
public void sub();
}
interface i3
{
public void mul();
}
interface i4
{
public void div();
}
class intimp implements i1,i2,i3,i4
{
	public void add()
	{
	System.out.println("add");
	}
	
	public void sub()
	{
	System.out.println("sub");
	}
	
	public void mul()
	{
	System.out.println("mul");
	}

	public void div()
	{
	System.out.println("div");
	}
}
class adapter extends intimp
{
	public static void main(String args[])
	{
	    intimp p=new intimp();
	     p.add();
	}
}
	
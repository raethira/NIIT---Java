class call
{
	void change(int x,int y)
	{
	     x=x+10;
	     y=y+10;
	    System.out.println("x="+x+"y="+y);
	}
}

class ab
{
	public static void main(String args[])
	{
		change d=new change();
		d.bb();
	}
}
class change
{
	int a=10,b=20;
	void bb()
	{
		call c=new call();
		c.change(a,b);
		System.out.println("inside b a="+a+"b="+b);
	}
}
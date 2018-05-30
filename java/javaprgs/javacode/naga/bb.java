import java.io.*;
class aa
{
	static int a=10,b=20;
	int x,y,z;
	void dec(int aa,int bb)
	{
	      	a=aa;
	       	b=bb;
	}
	void disa(int x,int y)
	{
		this.x=x;
		this.y=y;	
		z=x+y;
	    	System.out.println("addition is="+z);
	}
	static void disb()
	{
	    	System.out.println("a="+a+"b="+b);
	}
}
class bb
{
	public static void main(String args[])
	{
		aa a=new aa();
	 	a.disb();
		a.disa(5,10);
	}
} 	       
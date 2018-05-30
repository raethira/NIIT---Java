class javademo
{
static int i,j;
static float x,y;
	static int display(int i,int j)
	{
	this.i=i;
	this.j=j;
	return i+j;
	}
	static float display1(float x,float y)
	{
	this.x=x;
	this.y=y;
	return x+y;	
	}
}
class javademo7
{
public static void main(String kat[])
{
//javademo obj=new javademo();
System.out.println(javademo.display1(10f,30f));
System.out.println(javademo.display(10,30));
}
}
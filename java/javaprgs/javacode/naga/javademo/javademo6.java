class javademo
{
int i,j;
float x,y;
	 int display(int i,int j)
	{
	this.i=i;
	this.j=j;
	return i+j;
	}
	 float display1(float x,float y)
	{
	this.x=x;
	this.y=y;
	return x+y;	
	}
}
class javademo6
{
public static void main(String kat[])
{
javademo obj=new javademo();
System.out.println(obj.display1(10f,30f));
System.out.println(obj.display(10,30));
}
}
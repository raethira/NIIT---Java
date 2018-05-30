class javademo
{
	 int display(int i,int j)
	{
	return (i+j);
	}
int display3(int i,int j,int k)
	{
	return (i+j+k);
	}
	 float display1(float i,float j)
	{
	return i+j;
	}
}
class javademo4
{
public static void main(String kat[])
{
int m,u;
float n;
javademo obj=new javademo();
m=obj.display(10,30);
n=obj.display1(10f,30f);
u=obj.display3(12,23,23);
System.out.println(m);
System.out.println(n);
System.out.println(u);
}
}
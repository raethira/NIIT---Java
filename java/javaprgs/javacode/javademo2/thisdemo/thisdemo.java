//thisdemo
class add
{
	int i,j,k;
	float l;
	double m;
	String str;
	add(int i,int j)
	{
		this.i=i;
		this.j=j;
		System.out.println(i+j);
	}
	add(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
		System.out.println(i+j+k);
	}
	add(double m,int j,float l)
	{
		this.l=l;
		this.j=j;
		this.k=k;
		System.out.println(i+j+k);
	}
	add()
	{
		System.out.println("welcone");
	}
	add(String str)
	{
		this.str=str;
		System.out.println(str);
	}
	public static void main(String[] args) 
	{
		add a=new add();
		add a1=new add(12,45);
		add a2=new add(12,34,56);
		add a3=new add(12f,45,67f);
		add a4=new add("kathir");
	}
}

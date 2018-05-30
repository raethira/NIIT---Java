//constructor overloading
class add
{
	add(int i,int j)
	{
		System.out.println(i+j);
	}
	add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	add(double i,int j,float k)
	{
		System.out.println(i+j+k);
	}
	add()
	{
		System.out.println("welcone");
	}
	add(String str)
	{
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

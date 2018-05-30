class thisdemo3
{
	static int i,j;
	static int add(int i,int j)
	{
		this.i=i;
		this.j=j;
		return i+j;
	}
	public static void main(String[] args) 
	{
		System.out.println(thisdemo3.add(34,56));
		System.out.println("Hello World!");
	}
}

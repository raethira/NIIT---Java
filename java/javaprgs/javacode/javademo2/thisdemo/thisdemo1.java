class thisdemo1
{
	int i,j;
	thisdemo1(int i,int j)
	{
		this.i=i;
		this.j=j;
		System.out.println( i+j);
	}
	public static void main(String[] args) 
	{
		thisdemo1 a=new thisdemo1(23,45);
	}
}

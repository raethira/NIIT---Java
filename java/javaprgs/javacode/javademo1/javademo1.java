//assign value at object creating time
class javademo1 
{
	int i;
	float j;
	char k;
	String l;
	public static void main(String[] args) 
	{
		javademo1 a=new javademo1();
		System.out.println(a.i=10);
		System.out.println(a.j=20f);
		System.out.println(a.k='o');
		System.out.println(a.l="kalai");
	}
}
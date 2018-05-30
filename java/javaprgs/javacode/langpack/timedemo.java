class timedemo 
{
	public static void main(String[] args) 
	{
		long  i,j;
		i=System.currentTimeMillis();
		System.out.println(i);
		System.out.println("Welcome to all");
		j=System.currentTimeMillis();
		System.out.println(i);
		System.out.println("elappesed time"+(i-j));
	}
}

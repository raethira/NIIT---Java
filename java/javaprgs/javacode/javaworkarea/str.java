class str 
{
	public static void main(String[] args) 
	{
		String a="kathir";
		String a1="kathir";
		System.out.println(a.equals(a1));
		String b=new String("kathir");
		String b1=new String("kathir");
		System.out.println(a.equals(a1));
		StringBuffer c=new StringBuffer("kathir");
		StringBuffer c1=new StringBuffer("kathir");
		System.out.println(a.equals(a1));
		}
}

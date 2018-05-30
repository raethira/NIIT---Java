class testin 
{
	public static void main(String[] args) 
	{
		byte b[]=new byte[80];
		System.out.println("text duisplayed here");
		try
		{
			System.in.read(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		String str=new String(b);
		System.in.read();
		System.out.println(str);
		System.out.println("Hello World!");
	}
}

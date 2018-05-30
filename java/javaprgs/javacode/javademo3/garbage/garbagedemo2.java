//finilize method
class garbagedemo2
{
	protected void finilize()
	{
		System.out.println("java");
	}
	public static void main(String kat[])
	{
		garbagedemo2 obj1=new garbagedemo2();
		obj1=null;
		obj1.gc();
	}
}

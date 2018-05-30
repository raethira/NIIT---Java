import java.io.*;
class check 
{
	static void p(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
			File f=new File("/filedesc");				   
			if(f.isDirectory())
		{
			p("directory of"+f);
			String s[]=f.list();
			for(int i=0;i<s.length;i++)
			{
				File f1=new File(f+""+s[i]);
				if(f1.isDirectory())
				{
					p(s[i]+"   "+"is directory");
				}
				else
				{
					p(s[i]+"   "+"is not directory");
				}
			}
		}
		else
		{
			p(f+"    "+"is not directory");
		}
	}
}

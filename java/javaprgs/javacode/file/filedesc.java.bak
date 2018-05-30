import java.io.*;
class filedesc 
{
	static void p(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
			File f=new File(args[0]);
			p("File name"+f.getName());
			p("File path"+f.getPath());
			p("File parent"+f.getParent());
			p("File absolutepath"+f.getAbsolutePath());
			p(f.exists()?"exit":"doesnot exit");
			p(f.canWrite()?"canwitre":"caotwrite");
			p(f.canRead()?"canread":"canotread");
			p(f.isDirectory()?"directory":"notdirectory");
			p(f.isFile()?"yesfile":"notfile");
			p(f.isAbsolute()?"isAbsolute":"isnotAbsolute");
			p("lastmodified"+f.lastModified());
			p("File parent"+f.getParent());
			p("length"+f.length());
			p("welcome to all");
			System.out.println(f.hashCode());
	}
}

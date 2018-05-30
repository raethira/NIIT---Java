import java.io.*;
class employee implements Serializable
{
	private int empcode;
	private String empname;
	private float empsalary;
	public employee(){};
	public employee(int empcode,String empname,float empsalary)
	{
			this.empcode=empcode;
			this.empname=empname;
			this.empsalary=empsalary;
	}
	public void show()
	{
		System.out.println(empcode);
		System.out.println(empname);
		System.out.println(empsalary);
	}
}

//serializable object
class reademployee
{
	public static void main(String[] args) 
	{
		employee e=new employee();
		try
		{
		FileInputStream fin=new FileInputStream("belsi.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		e=(employee)ois.readObject();
		e.show();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		System.out.println("Hello World!");
	}
}

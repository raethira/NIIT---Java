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

import java.io.*;
class employee implements Serializable
{
	private int empcode;
	private String empname;
	private Double empsalary;
	public employee(int empcode,String empname,Double empsalary)
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

import java.io.*;
public class myclass implements Serializable
{
	String name,id;
	myclass(String name,String id)
	{
		this.name=name;
		this.id=id;
	}
	public void show()
	{
		System.out.println("name:"+name+"id:"+id);
	}
}

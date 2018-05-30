//serializable interface
import java.io.*;
class  myclass implements Serializable
{
	   String name;
	   String id;
	   myclass(String name,String id)
	{
		   this.name=name;
		   this.id=id;
	}
	public void show()
	{
		System.out.println(name);
		System.out.println(id);
	}
}

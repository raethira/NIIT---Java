import java.io.*;
class dataout
{
	public static void main(String[] args) 
	{
		try
		{
			
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("text.txt"));
			dos.writeInt(25);
			dos.writeDouble(25.98);
			dos.writeUTF("kathir");
			dos.close();
			DataInputStream dis=new DataInputStream(new FileInputStream("text.txt"));
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dos);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

import java.util.*;
class strtok 
{
String str="welcomre to all="+"hai to =everybody"+"hai every=body";
	public static void main(String[] args) 
	{
		StringTokenizer   st=new StringTokenizer("=");
		 while(st.hasMoreElements	())
		{
			 String key=st.nextToken();
			 String val=st.nextToken();
			System.out.println(key+"\t"+val);
		}
	}
}

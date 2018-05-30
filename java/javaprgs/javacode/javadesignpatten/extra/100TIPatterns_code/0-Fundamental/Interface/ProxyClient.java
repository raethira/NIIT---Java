public class ProxyClient
{
public static void main(String args[])
{
  try{
  String className=args[0];
  Class c=Class.forName(className);
  
  IOrder obj=(IOrder)c.newInstance();
  
  System.out.println(obj.getAmount() +" From " + obj.toString());
  
  }catch(Exception e)
  {
    System.out.println(e);
  }
}
}
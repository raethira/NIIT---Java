public class OrderFactory
{
 public static IOrder getOrder(String className)
 {
   IOrder obj=null;
   try{
    obj=(IOrder)Class.forName(className).newInstance();
   }catch(Exception e)
   {
     System.out.println(e);
  }
  return obj;
 }
}
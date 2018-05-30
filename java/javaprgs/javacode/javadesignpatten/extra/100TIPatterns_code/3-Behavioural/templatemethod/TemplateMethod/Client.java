public class Client
{
public static void main(String args[])
{
  try{
	  IOrder obj=OrderFactory.getOrder(args[0]);
	  System.out.println("Amount: "+obj.getAmount());

  }catch(Exception e)
  {
    System.out.println(e);
  }
}
}
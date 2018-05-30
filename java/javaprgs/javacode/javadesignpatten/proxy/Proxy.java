class Proxy implements IOrder
{

	IOrder obj;

   Proxy(String type)
   {
try{

       obj = (IOrder)Class.forName(type).newInstance();
   }catch(Exception e){}
}

   public void product()
   {

       System.out.println("Proxy called for product");

      obj.product();

   }
   public void price()
   {

      System.out.println("Proxy called for price");
      obj.price();
	}

}
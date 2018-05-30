public class Proxy implements IOrder
{
      public double getAmount()
      {
          System.out.println("From Proxy");
           IOrder obj=(IOrder)new SaleOrder();
			return obj.getAmount();
      }
}


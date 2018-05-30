public class SaleOrder extends AbsOrder
{
      public double getDiscount()
      {
         System.out.println("SaleOrder.getDiscount()");
         return 100;
      }
}


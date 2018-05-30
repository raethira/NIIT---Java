public class SaleOrder extends AbsOrder
{
      public double getDiscount()//implementations of abstract Method
      {
         System.out.println("SaleOrder.getDiscount()");
         return 100;
      }
}


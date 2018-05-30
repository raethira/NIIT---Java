public class PurchaseOrder   extends AbsOrder
{
      public double getDiscount()
      {
         System.out.println("PurchaseOrder.getDiscount()");
         return 300;
      }
}


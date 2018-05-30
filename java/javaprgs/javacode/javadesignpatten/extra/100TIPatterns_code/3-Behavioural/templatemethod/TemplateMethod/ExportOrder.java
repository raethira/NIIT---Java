public class ExportOrder  extends AbsOrder
{
      public double getDiscount()
      {
         System.out.println("ExportOrder.getDiscount()");
         return 200;
      }
}
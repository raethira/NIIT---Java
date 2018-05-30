public abstract class AbsOrder implements IOrder
{
      public double getAmount()  //Template Method
      {
         System.out.println("AbsOrder.getAmount()");
         double result= 1000-getDiscount();
         return result;
      }
      protected abstract double getDiscount();
}

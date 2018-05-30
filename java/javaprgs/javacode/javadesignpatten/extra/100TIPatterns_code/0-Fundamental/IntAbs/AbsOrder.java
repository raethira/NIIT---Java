public abstract class AbsOrder implements IOrder
{
      public double getAmount()
      {
  		 System.out.println("AbsOrder.getAmount()");
         return 1000;
      }
      public abstract double getDiscount();

}

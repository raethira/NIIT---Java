class OrderFactory implements IOrderFactory
{

 public IOrder createOrder() throws Exception
  {

        return new LocalOrder();
  }
}
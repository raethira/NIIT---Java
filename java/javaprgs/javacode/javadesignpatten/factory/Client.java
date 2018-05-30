class Client
{

  public static void main(String args[])
  {
    try{

    IOrder iorder;
    IOrderFactory ifactory = ((IOrderFactory)Class.forName(args[0]).newInstance());
    iorder = ifactory.createOrder();
    iorder.product();
    iorder.price();
}catch(Exception e){}

}




}
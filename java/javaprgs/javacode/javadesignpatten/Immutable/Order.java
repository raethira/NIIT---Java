class Order
{
  Order(String id, String date)
  {
	 this.orderId = id;
	 this.date = date;
  }
  private  String orderId = "";
  private String date = "";
  public String getOrderId()
  {
     return orderId;
  }
  public Order setOrder(String id, String date)
  {
    return new Order(id,date);
  }
  public String getDate()
    {
       return date;
  }
}
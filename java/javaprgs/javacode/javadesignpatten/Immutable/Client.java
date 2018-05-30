class Client implements Runnable{
static Order order ;
 public static void main (String args[])
 {
    order = new Order(args[0],args[1]);
    System.out.println("Order created");
    System.out.println("Order id="+ order.getOrderId());
    System.out.println("Order date"+ order.getDate());
try{
    Thread t1= new Thread(new Client());
    t1.start();
   // t1.join();
    //this.sleep(1000);
	System.out.println(" from main Order id="+ order.getOrderId());
    System.out.println(" from main Order date"+ order.getDate());
}catch(Exception e){} }
public  void run ()
{
	Client.callMe();}
public static void callMe ()
{
	Order o1 =order.setOrder("satish", "1/2/2004");
	System.out.println("o1 id="+ o1.getOrderId());
    System.out.println("o1 date"+ o1.getDate());
}}
class Client
 {
   public static void main(String args[])
     {
 	 try
 	  {
       IPerson obj=(IPerson)Class.forName(args[0]).newInstance();
       System.out.println(obj.getAddress());
       System.out.println(obj.getCity());

       }catch(Exception e){e.printStackTrace();}
       }
     }

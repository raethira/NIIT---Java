final class object1{


 private int i;
 private static object1 s=new object1(71);
 private object1(int x)
 {
   i=x;
 }



 public static object1 getHandle()
 {

 return s;
 }


 public int getValue(){return i;}
 public void setValue(int x){i=x;}



 }

 public class objectpool
 {


    public static void main(String args[])
    	{


          for(int j=0;j<5;j++)
            {

    		object1 s=object1.getHandle();

    		System.out.println(s);//.getValue());
    		System.out.println(s.getValue());
 			}





    		try
    		   {
    		     //Singleton s3=(Singleton)s2.clone();
    		    }catch(Exception e){}
       }
    }
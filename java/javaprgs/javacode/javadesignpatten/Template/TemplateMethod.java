abstract class ApplicationFramework {
  public ApplicationFramework() {
    templateMethod();
  }
  abstract void customize1();
  abstract void customize2();
  final void templateMethod() {
    for(int i = 0; i < 5; i++) {
      customize1();
      customize2();
    }
  }
}


class MyApp extends ApplicationFramework {
  void customize1() {
    System.out.print("Hello ");
  }
  void customize2() {
    System.out.println("World!");
  }
}

public class TemplateMethod
{
  MyApp app = new MyApp();
  public void test() {

  }
  public static void main(String args[])
  {
  	TemplateMethod t1 =new TemplateMethod();
        t1.test();

  }
}

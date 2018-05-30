import java.util.*;

interface Visitor {
  void visit(Gladiolus g);
  void visit(Runuculus r);
  void visit(Chrysanthemum c);
}


interface Flower {
  void accept(Visitor v);
}

class Gladiolus implements Flower
{
  public void accept(Visitor v)
  {
	  v.visit(this);
  }
}

class Runuculus implements Flower
{
  public void accept(Visitor v)
  {
	  v.visit(this);
  }
}

class Chrysanthemum implements Flower
{
  public void accept(Visitor v)
  {
	  v.visit(this);
  }
}


class StringVal implements Visitor
{
  String s;
  public String toString() { return s; }
  public void visit(Gladiolus g) {
    s = "Gladiolus";
  }
  public void visit(Runuculus r) {
    s = "Runuculus";
  }
  public void visit(Chrysanthemum c) {
    s = "Chrysanthemum";
  }
}


class Bee implements Visitor
{
  public void visit(Gladiolus g)
  {
    System.out.println("Bee and Gladiolus");
  }
  public void visit(Runuculus r)
  {
    System.out.println("Bee and Runuculus");
  }
  public void visit(Chrysanthemum c)
  {
    System.out.println("Bee and Chrysanthemum");
  }
}

class FlowerGenerator {
  private static Random rand = new Random();
  public static Flower newFlower() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Gladiolus();
      case 1: return new Runuculus();
      case 2: return new Chrysanthemum();
    }
  }
}

public class BeeAndFlowers
{
  List flowers = new ArrayList();
  public BeeAndFlowers() {
    for(int i = 0; i < 10; i++)
      flowers.add(FlowerGenerator.newFlower());
  }
  public void test() {

    StringVal sval = new StringVal();
    Iterator it = flowers.iterator();
    while(it.hasNext()) {
      ((Flower)it.next()).accept(sval);
      System.out.println(sval);
    }

    Bee bee = new Bee();
    it = flowers.iterator();
    while(it.hasNext())
      ((Flower)it.next()).accept(bee);
  }
  public static void main(String args[])
  {
    BeeAndFlowers t1 = new BeeAndFlowers();
    t1.test();


  }
}

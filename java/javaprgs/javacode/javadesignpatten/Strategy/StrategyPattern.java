interface FindMinima
{

  double[] algorithm(double[] line);
}


class LeastSquares implements FindMinima
{
  public double[] algorithm(double[] line) {
    return new double[] { 1.1, 2.2 };
  }
}

class NewtonsMethod implements FindMinima
{
  public double[] algorithm(double[] line) {
    return new double[] { 3.3, 4.4 };
  }
}

class Bisection implements FindMinima
{
  public double[] algorithm(double[] line) {
    return new double[] { 5.5, 6.6 };
  }
}

class ConjugateGradient implements FindMinima
{
  public double[] algorithm(double[] line) {
    return new double[] { 3.3, 4.4 };
  }
}


class MinimaSolver {
  private FindMinima strategy;
  public MinimaSolver(FindMinima strat) {
    strategy = strat;
  }
  double[] minima(double[] line) {
    return strategy.algorithm(line);
  }
  void changeAlgorithm(FindMinima newAlgorithm) {
    strategy = newAlgorithm;
  }
}

public class StrategyPattern
{
  MinimaSolver solver =
    new MinimaSolver(new LeastSquares());
  double[] line = {
    1.0, 2.0, 1.0, 2.0, -1.0,
    3.0, 4.0, 5.0, 4.0 };
  public void test() {
    System.out.println(
      Arrays2.toString(solver.minima(line)));
    solver.changeAlgorithm(new Bisection());
    System.out.println(
      Arrays2.toString(solver.minima(line)));
  }
  public static void main(String args[])
  {

	StrategyPattern s1 =new StrategyPattern();
	s1.test();


  }
}

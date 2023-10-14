import java.util.*;

public class Main {
  private static double f(double x) {
    return Math.sin((Math.PI / 2.0) + Math.pow(x, 2));
  }

  private static double df(double x) {
    return 2 * x * Math.cos(Math.PI / 2.0 + Math.pow(x, 2));
  }

  public static void main(String[] args) {
    double x0 = 4.0;

    Expression halfPi = new Constant(Math.PI / 2.0);
    Expression x = new X(); // f(x) = x
    Expression f = new Sin(new Add(halfPi, new Square(x))); // sin(0.5 \pi + x^2)
    DualNumber result = f.calculate(new DualNumber(x0, 1));

    //result.prettyPrint();
    System.out.println("sin(pi/2 + x^2), x0 = " + x0);
    System.out.println();

    double correctValue = f(x0);
    double derivateCorrectValue = df(x0);

    System.out.println("True");
    System.out.println("f(" + x0 + ") = " + correctValue);
    System.out.println("f'(" + x0 + ") = " + derivateCorrectValue);
    System.out.println();

    System.out.println("Computed");
    System.out.println("f(" + x0 + ") = " + result.u);
    System.out.println("f'(" + x0 + ") = " + result.uprime);
    System.out.println();

    System.out.println("error value " + (correctValue - result.u));
    System.out.println("error derivate " + (derivateCorrectValue - result.uprime));
    System.out.println();

    System.out.println("derivative by finite differences");
    final double[] epsilons = {1e-6, 1e-8, 1e-10, 1e-12};
    for (int i = 0; i < epsilons.length; i++) {
      double finiteDerivatives = (f(x0 + epsilons[i]) - f(x0)) / epsilons[i];
      System.out.println("for epsilon " + epsilons[i] + ", " + finiteDerivatives + ", error " + Math.abs(result.uprime - finiteDerivatives));
    }
  }
}
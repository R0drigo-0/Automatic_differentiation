public class Tan implements Expression {
  private Expression expr;

  public Tan(Expression expr) {
    this.expr = expr;
  }

  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = expr.calculate(dn);
    return new DualNumber(Math.tan(dn1.u), dn1.uprime / Math.pow(Math.cos(dn1.u), 2));
  }

  public void prettyPrint() {
    System.out.println("tan");
  }
}
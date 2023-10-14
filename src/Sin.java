public class Sin implements Expression {
  private Expression expr;

  public Sin(Expression expr) {
    this.expr = expr;
  }

  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = expr.calculate(dn);
    return new DualNumber(Math.sin(dn1.u), dn1.uprime * Math.cos(dn1.u));
  }

  public void prettyPrint() {
    System.out.println("sin");
  }
}
public class Cos implements Expression {
  private Expression func;

  public Cos(Expression func) {
    this.func = func;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = func.calculate(dn);
    return new DualNumber(Math.cos(dn1.u), (-1) * dn1.uprime * Math.sin(dn1.u));
  }

  @Override
  public void prettyPrint() {
    System.out.println("cos");
  }
}

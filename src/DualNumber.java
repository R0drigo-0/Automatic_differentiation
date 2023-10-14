public class DualNumber implements Expression {
  protected double u;
  protected double uprime;

  public DualNumber(double u, double uprime) {
    this.u = u;
    this.uprime = uprime;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    return dn;
  }

  public void prettyPrint() {
    System.out.println("<" + this.u + ", " + this.uprime + ">");
  }
}

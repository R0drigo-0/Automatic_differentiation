public class X implements Expression {
  public X() {
    // void
  }

  public DualNumber calculate(DualNumber dn) {
    return new DualNumber(dn.u, 1.0);
  }

  public void prettyPrint() {
    System.out.println("x");
  }


}

public class Log implements Expression {
  public Log() {
    //void
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    return new DualNumber(dn.u, 1.0);
  }

  public void prettyPrint() {
    System.out.println("log");
  }
}

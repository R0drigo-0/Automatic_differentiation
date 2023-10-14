public class Square extends BinaryOperator {
  public Square(Expression expr1) {
    super(expr1, null);
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = left.calculate(dn);
    return new DualNumber(Math.pow(dn1.u, 2), 2 * dn1.u * dn1.uprime);
  }

  public void prettyPrint() {
    System.out.println("^2");
  }

}

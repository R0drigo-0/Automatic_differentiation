public class Power extends BinaryOperator {
  public Power(Expression expr1, Expression expr2) {
    super(expr1, expr2);
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = left.calculate(dn);
    DualNumber dn2 = right.calculate(dn);
    return new DualNumber(Math.pow(dn1.u, dn2.u),
        dn2.uprime * Math.log(dn1.u + dn2.u * (dn1.uprime / dn2.u)));
  }

  public void prettyPrint() {
    System.out.println("^");
  }
}

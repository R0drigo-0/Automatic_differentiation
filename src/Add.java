public class Add extends BinaryOperator {
  public Add(Expression expr1, Expression expr2) {
    super(expr1, expr2);
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = left.calculate(dn);
    DualNumber dn2 = right.calculate(dn);
    return new DualNumber(dn1.u + dn2.u,
        dn1.uprime + dn2.uprime);
  }

  @Override
  public void prettyPrint() {
    System.out.println("+");
  }
}

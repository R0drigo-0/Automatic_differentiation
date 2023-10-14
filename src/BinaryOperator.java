public abstract class BinaryOperator implements Expression {
  protected Expression left;
  protected Expression right;

  public BinaryOperator(Expression leftOperand, Expression rightOperand) {
    left = leftOperand;
    right = rightOperand;
  }

  public DualNumber calculate(DualNumber dn) {
    return dn;
  }

  public void prettyPrint(Expression e) {
    System.out.print("(");
    left.prettyPrint();
    System.out.print(")");
    e.prettyPrint();
    System.out.print("(");
    right.prettyPrint();
    System.out.print(")");
  }
}

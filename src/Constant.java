public class Constant implements Expression {
  private double value;

  public Constant(double value) {
    this.value = value;
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    return new DualNumber(this.value, 0.0);
  }

  public void prettyPrint() {
    System.out.print(value);
  }
}

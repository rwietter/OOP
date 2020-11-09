package withInheritance;

interface ICalculator {
  public double getMultiplication (double num1, double num2);
  public double getSum (double num1, double num2);
  public double getSubtraction (double num1, double num2);
  public double getDivision (double num1, double num2);
}

public class Calculator implements ICalculator {
  double num1, num2;

  @Override
  public double getMultiplication (double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
    return this.num1 * this.num2;
  }

  @Override
  public double getSum (double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
    return this.num1 + this.num2;
  }

  @Override
  public double getSubtraction (double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
    return this.num1 - this.num2;
  }

  @Override
  public double getDivision(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
    return this.num1 / this.num2;
  }
}


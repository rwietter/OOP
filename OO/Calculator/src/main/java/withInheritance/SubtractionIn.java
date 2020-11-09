package withInheritance;

public class SubtractionIn extends Calculator {
  public double subtraction(double num1, double num2) {
    return super.getSubtraction(num1, num2);
  }
}

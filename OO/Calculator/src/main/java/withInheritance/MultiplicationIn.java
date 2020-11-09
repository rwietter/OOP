package withInheritance;

public class MultiplicationIn extends Calculator {
  public double multiplication(double num1, double num2) {
    return super.getMultiplication(num1, num2);
  }
}

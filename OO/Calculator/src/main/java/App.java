import calculator.Division;
import calculator.Multiplication;
import calculator.Subtraction;
import calculator.Sum;

import java.util.Scanner;

class App {
  public static void main(String[]args){
    Sum sum = new Sum();
    Division div = new Division();
    Multiplication mult = new Multiplication();
    Subtraction sub = new Subtraction();

    Scanner scan = new Scanner(System.in);

    String operator = null;
    double firstNumber, secondNumber, result;

    System.out.print("Insert an arithmetic operator: ");
    operator = scan.next();

    if(operator == null){
      throw new IllegalArgumentException();
    }

    System.out.print("Insert first number: ");
    firstNumber = scan.nextDouble();
    System.out.print("Insert second number: ");
    secondNumber = scan.nextDouble();

    switch (operator) {
      case "+":
        result = sum.sumValues(firstNumber, secondNumber);
        System.out.println("Result of Sum: " + result);
        break;
      case "-":
        result = sub.subtractionValues(firstNumber, secondNumber);
        System.out.println("Result of Subtraction: " + result);
        break;
      case "/":
        result = div.divisionValues(firstNumber, secondNumber);
        System.out.println("Result of Division: " + result);
        break;
      case "*":
        result = mult.multiplicationValues(firstNumber, secondNumber);
        System.out.println("Result of Multiplication: " + result);
        break;
      default:
        System.out.println("Invalid operation");
        break;
    }
  }
}

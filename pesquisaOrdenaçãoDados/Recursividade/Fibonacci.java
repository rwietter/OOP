class Fibonacci {

  int calculaFibonacci(int n) {
    return n < 2 ? n : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
  }

  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
    for (int i = 0; i <= 30; i++) {
      int result = fibonacci.calculaFibonacci(i);
      System.out.print("\n(" + i + "):" + fibonacci.calculaFibonacci(i) + "\t");
    }
  }
}


// https://www.devmedia.com.br/sequencia-de-fibonacci-em-java/23620

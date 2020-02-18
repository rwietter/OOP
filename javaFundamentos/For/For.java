class	For	{
  public static void main(String[] args) {
    int toIntNumberDivider = 10;
    System.out.println(toIntNumberDivider / 0.0); // Infinity
    System.out.println(toIntNumberDivider / 0); // java.lang.ArithmeticException: / by zero
    for (int i = 0; i < 10; i = i + 1) {
      System.out.println("olá!");
      if (i % 19 == 0) {
        System.out.println("Achei um número divisível por 19 entre x e y");
        continue;
        // break;
      }
    }
  }
} 

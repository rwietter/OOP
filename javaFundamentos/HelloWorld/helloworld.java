public class helloworld {
  public static void main(String[] args) {

    // tipos primitivos
    int agePerson = 22;
    int year = 2020;
    double pi = 3.14;
    double x = 5 * 10;
    boolean verdade = true;
    char letra = 'a'; // guarda apenas 1 caractere, não menos e não mais que isso
    // byte = 2;
    // short = 3;
    // long = 4;
    // float = 4.5;
    // alterando o tipo:
    double	d3	=	3.14;
    int	value	=	(int)	d3;
    
    for (int i = 0; i < agePerson; i++) {
      int test = year + i;
    }
    System.out.println(test);
  }
}

/*
  public class Conta(int numero){ this.numero = numero; this.saldo = 0.0;}
  public double consultaSaldo(){ return this.saldo; }
  public void alteraSaldo(double valor){ this.saldo = this.saldo + valor; }
  public int qualEhONumeroDaConta(){ return this.numero; }
*/

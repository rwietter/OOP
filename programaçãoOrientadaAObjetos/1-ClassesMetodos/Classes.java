class	Conta	{
  int numero; //
  String titular; // atributos
  double saldo; //
  double salario;

  // Método que faz uma consulta mas não retorna nada
  void saca(double quantidade) { // MÉTODOS
    double novoSaldo = this.saldo - quantidade;
    this.saldo = novoSaldo; // usamos	a	palavra	chave this para	mostrar	que	esse	é	um	atributo,	e	não	uma	simples	variável. 
  }

  // Deposita alguma quantia
  void deposita(double quantidade) { // MÉTODOS
    this.saldo += quantidade;
  }
}
// classes são uma receita do que um objeto tem 
// Quando	uma	variável é declarada diretamente dentro	do escopo	da classe, é chamada de variável de	objeto, ou atributo.

class	Classes	{
  public static	void main(String[] args)	{

    Conta	minhaConta; // referência a classe
    minhaConta = new	Conta(); // instância/constroi a classe // cria um objeto do tipo Conta
    
    minhaConta.titular = "Duke";
    minhaConta.saldo = 1000.0;
    minhaConta.numero = 74782;
    System.out.println("Saldo atual: R$ " + minhaConta.saldo);
    
    minhaConta.saca(200); // Chama a fução saca da classe Conta pela referencia de minhaConta
  
    minhaConta.deposita(500);
    System.out.println(minhaConta.saldo);
  }
} 

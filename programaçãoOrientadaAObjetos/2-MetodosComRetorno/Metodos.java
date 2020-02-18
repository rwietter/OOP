// MÉTODOS	COM	RETORNO



class	Conta	{
  int numero; //
  String titular; // atributos
  double saldo; //
  double salario;
  
  /* Método que faz uma consulta mas não retorna nada
  void saca(double quantidade) { // MÉTODOS
    double novoSaldo = this.saldo - quantidade;
    this.saldo = novoSaldo; // usamos	a	palavra	chave this para	mostrar	que	esse	é	um	atributo,	e	não	uma	simples	variável. 
  }
  */
  boolean saca(double valor) {
    if(this.saldo < valor){
      return false;
    }
    else {
      this.saldo = this.saldo - valor;
      return true;
    }
  }
  
  // Deposita alguma quantia
  void deposita(double quantidade) { // MÉTODOS
    this.saldo += quantidade;
  }


}
// classes são uma receita do que um objeto tem 
// Quando	uma	variável é declarada diretamente dentro	do escopo	da classe, é chamada de variável de	objeto, ou atributo.



class	Metodos	{
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

    boolean consegui = minhaConta.saca(500);
    if(consegui) {
      System.out.println("Consegui sacar");
    } else {
      System.out.println("Não consegui sacar");
    }
  }
} 


/*
- Um método sempre tem que definir o que retorna, nem que defina que não há retorno, como nos exemplos anteriores onde estávamos usando o void

*/

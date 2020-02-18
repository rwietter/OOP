/* CLASSE DA CONTA DO CLIENTE */
class	Conta	{
  int numero;
  Cliente titular;
  // Cliente	titular	=	new	Cliente(); => quando chamar new Conta, havera um new Cliente para ele com valores defaults
  double saldo;

  // verifica se o valor a ser retirado existe na conta
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

  // tranfere um valor
  boolean transfere(Conta destino, double valor) {
    // Conta destino == uma cópia de conta que destino referencia
    boolean retirouValor = this.saca(valor);
    if(retirouValor == true) {
      return true;
    } else {
      destino.deposita(valor);
      return false;
    }
  }
}

/* CLASSE DOS DADOS PESSOAIS DO CLIENTE */
class Cliente {
  String nome;
  String sobrenome;
  String cpf;
}

class	Atributos	{
  public static	void main(String[] args)	{

    /* CONTA */
    Conta	minhaConta; // referência a classe
    minhaConta = new Conta(); // instância/constroi a classe // cria um objeto do tipo Conta
    
    // minhaConta.titular.nome => se usar antes de instanciar ele causa um NullPointerException
    
    /* CLIENTE */
    Cliente	cliente	=	new	Cliente();
    minhaConta.titular = cliente; /* minhaConta refere-se ao meu cliente */
    
    String name = minhaConta.titular.nome = "Duke";
    String lastname = minhaConta.titular.sobrenome = "de Caxias";
    String cpf = minhaConta.titular.cpf = "043.638.478-73";
    minhaConta.saldo = 1000.0;
    minhaConta.numero = 74782;
    System.out.println("Nome: " + name);
    System.out.println("Sobrenome: " + lastname);
    System.out.println("CPF: " + cpf);
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

=> A classe Banco usa	a	classe Conta que usa a classe Cliente, que usa a classe Endereco . Dizemos que esses objetos colaboram, trocando mensagens entre si. Por isso acabamos tendo muitas classes em nosso sistema, e elas costumam ter um tamanho relativamente curto.

=> Quando damos new em um objeto, ele o inicializa com seus valores default, 0 para números, false para boolean e null para referências. null é uma palavra chave em java, que indica uma referência para nenhum objeto.

=> Se, em algum caso, você tentar acessar um atributo ou método de alguém que está se referenciando para null , você receberá um erro durante a execução ( NullPointerException , que veremos mais à frente). Da para perceber, então, que o new não traz um efeito cascata, a menos que você dê um valor default (ou use construtores, que também veremos mais a frente).

*/

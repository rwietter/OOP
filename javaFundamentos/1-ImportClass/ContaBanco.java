class Conta {
  private String titular;
  private int numero;
  private String agencia;
  private double saldo;
  private static int totalContas; // variável única compartilhada por todos os objetos desta classe
  DataConta dataAbertura;
  ClienteDaConta clientAccount;

  Conta(String titular) {
    this.titular = titular;
  }
  
  Conta(int numero, String titular) {
    this(titular);
    this.numero = numero;
    Conta.totalContas = Conta.totalContas + 1; // faz a contagem de conta de todos os objetos por conta de ser uma variável estática.
  }

  public boolean setTitular(String titular) {
    this.titular = titular;
    return true;
  }

  public String getTitular() {
    return this.titular;
  }

  public boolean setAgencia(String agencia) {
    this.agencia = agencia;
    return true;
  }

  public String getAgencia() {
    return this.agencia;
  }

  boolean sacarValor(double valorASerSacado) {
    if (valorASerSacado > this.saldo) {
      return false;
    } else {
      this.saldo -= valorASerSacado;
      return true;
    }
  }

  public double getSaldo() {
    return this.saldo;
  }
  
  public double depositaValor(double valorASerDepositado) {
    return this.saldo += valorASerDepositado;
  }

  boolean retiraValor(double valorASerRetirado) {
    if (valorASerRetirado > this.saldo) {
      return false;
    } else {
      this.saldo -= valorASerRetirado;
      return true;
    }
  }

  boolean calculaRendimento() {
    return true;
  }

  String systemOutPrint() {
    String dados = "Nome: " + this.clientAccount.getNome() + " " + this.clientAccount.getSobrenome();
    dados += "\nCPF: " + this.clientAccount.getCPF();
    dados += "\nTitular: " + this.titular;
    dados += "\nNúmero: " + this.numero;
    dados += "\nSaldo: R$ " + this.saldo;
    dados += "\nAgência: " + this.agencia;
    dados += "\nData Abertua: " + this.dataAbertura.dataFormatada();
    return dados;
  }

  public static int getTotalContas() {
    return Conta.totalContas;
  }
}

class ClienteDaConta {
  private String nome;
  private String sobrenome;
  private String cpf;

  public boolean setNome(String nome) {
    this.nome = nome;
    return true;
  }

  public String getNome() {
    return this.nome;
  }

  public boolean setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
    return true;
  }

  public String getSobrenome() {
    return this.sobrenome;
  }

  public boolean setCPF(String cpf) {
    this.cpf = cpf;
    return true;
  }

  public String getCPF() {
    return this.cpf;
  }
}

class ContaBanco {
  public static void main(String[] args) {
  
    String idUser = "1";
    Conta minhaConta = new Conta(56853, idUser);

    int total = Conta.getTotalContas();
    System.out.println("Total de contas criadas: " + total);

    ClienteDaConta clientConta = new ClienteDaConta();
    minhaConta.clientAccount = clientConta;

    DataConta data = new DataConta();
    minhaConta.dataAbertura = data;

    String titular = "Mauricio";
    String agencia = "45656-8";
    double deposito = 1300;
    double saque = 300;

    minhaConta.setTitular(titular);
    minhaConta.setAgencia(agencia);
    minhaConta.depositaValor(deposito);

    String nome = "Mauricio";
    String cpf = "047.736.637-80";
    String sobrenome = "Witter";
    clientConta.setNome(nome);
    clientConta.setSobrenome(sobrenome);
    clientConta.setCPF(cpf);
    
    int dia = 22;
    int mes = 11;
    int ano = 2020;
    data.setDia(dia);
    data.setMes(mes);
    data.setAno(ano);

    minhaConta.sacarValor(saque); 
    
    System.out.println(minhaConta.getSaldo());

    boolean consegui = minhaConta.sacarValor(saque);
    if (consegui) {
      System.out.println("Consegui sacar");
    } else {
      System.out.println("Não consegui sacar");
    }

    double novoSaldo = -200;
    if (novoSaldo < 0) {
      System.out.println("Não é possível realizar essa operação");
    } else {
      minhaConta.depositaValor(novoSaldo);
    }
    System.out.println(minhaConta.systemOutPrint());
    System.out.println("Rendimento atual: R$ " + minhaConta.calculaRendimento());
  }
} 

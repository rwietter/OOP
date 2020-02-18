class ContaBanco {
  String nomeTitular;
  int numero;
  String agencia;
  double saldo;
  DataConta dataAbertura;

  boolean sacarValor(double valorASerSacado) {
    if (valorASerSacado > this.saldo) {
      return false;
    } else {
      this.saldo -= valorASerSacado;
      return true;
    }
  }

  boolean retiraValor(double valorASerRetirado) {
    if (valorASerRetirado > this.saldo) {
      return false;
    } else {
      this.saldo -= valorASerRetirado;
      return true;
    }
  }

  boolean depositaValor(double valorASerDepositado) {
    this.saldo += valorASerDepositado;
    return true;
  }

  boolean calculaRendimento() {
    return true;
  }

  String systemOutPrint() {
    String dados = "Titular: " + this.nomeTitular;
    dados += "\nNúmero: " + this.numero;
    dados += "\nSaldo: R$ " + this.saldo;
    dados += "\nAgência: " + this.agencia;
    dados += "\nData Abertua: " + this.dataAbertura.dataFormatada();
    return dados;
  }
}

// !== === !== === !== === !== === !== === !== === !== === !== ===

class DataConta {
  int dia;
  int mes;
  int ano;

  public String dataFormatada() {
    String dia = Integer.toString(this.dia);
    String mes = Integer.toString(this.mes);
    String ano = Integer.toString(this.ano);
    String data = dia + "/" + mes + "/" + ano;
    // String objetoString = String.valueOf(this.dia + this.mes + this.ano);
    return data;
  }
}

// !== === !== === !== === !== === !== === !== === !== === !== ===

class Conta {
  public static void main(String[] args) {
    ContaBanco contaAtributes = new ContaBanco();

    ContaBanco contaAtributesDois = new ContaBanco();

    DataConta data = new DataConta();
    contaAtributes.dataAbertura = data;

    // contaAtributesDois.nomeTitular = "Hugo";
    // contaAtributesDois.saldo = 80.0;
    
    contaAtributes.nomeTitular = "Carlos";
    contaAtributes.numero = 123;
    contaAtributes.agencia = "45656-8";
    contaAtributes.saldo = 50.0;
    data.dia = 23;
    data.mes = 04;
    data.ano = 2016;

    /*
    contaAtributes = contaAtributesDois; // QUANDO AMBAS APONTAM PARA O MESMO BLOCO DE MEMÓRIA, O RETORNO É TRUE

    if (contaAtributes == contaAtributesDois) {
      System.out.println("São igauis");
    } else {
      System.out.println("São diferentes");
    }
    */

    contaAtributes.depositaValor(300);

    System.out.println(contaAtributes.systemOutPrint());
    System.out.println("Rendimento atual: R$ " + contaAtributes.calculaRendimento());
  }
}

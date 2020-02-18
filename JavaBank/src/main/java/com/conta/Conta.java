package com.conta;

import com.clientedaconta.ClienteDaConta;
import com.dataconta.DataConta;

public class Conta {
  private String titular;
  private int numero;
  private String agencia;
  private double saldo;
  private static int totalContas; // variável única compartilhada por todos os objetos desta classe
  public DataConta dataAbertura;
  public ClienteDaConta clientAccount;

  public Conta(String titular) {
    this.titular = titular;
  }

  public Conta(int numero, String titular) {
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

  public boolean sacarValor(double valorASerSacado) {
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

  public boolean retiraValor(double valorASerRetirado) {
    if (valorASerRetirado > this.saldo) {
      return false;
    } else {
      this.saldo -= valorASerRetirado;
      return true;
    }
  }

  public boolean calculaRendimento() {
    return true;
  }

  public String systemOutPrint() {
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

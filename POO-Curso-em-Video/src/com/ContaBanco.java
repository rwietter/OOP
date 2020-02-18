package com;

/**
 * @author Mauricio
 */
public class ContaBanco {
  public int numero;
  protected String tipo;
  private String dono;
  private double saldo;
  private boolean status;

  public ContaBanco() {
    this.setStatus(false);
    this.setSaldo(0.0);
  }

  public void abrirConta(String userConta) {
    this.setTipo(userConta);
    this.setStatus(true);
    if("CC".equals(userConta)){
      this.setSaldo(50.0);
    } else if("CP".equals(userConta)) {
      this.setSaldo(150.0);
    }
    System.out.println("Conta aberta com sucesso");
  }

  public void fecharConta() {
    if (this.getSaldo() > 0) {
      System.out.println("Conta não pode ser fechada pois há saldo positivo nela");;
    } else if (this.getSaldo() < 0) {
      System.out.println("Conta não pode ser fechada, pois você está em débito");
    } else {
      this.setStatus(false);
      System.out.println("Conta fechada com sucesso");
    }
  }

  public void depositar(double deposito) {
    if (this.isStatus()) {
      this.setSaldo(deposito);
      System.out.println("Depósito realizado na conta de " + getDonoConta());
    } else {
      System.out.println("Não foi possível realizar o depósito.");
    }
  }

  public void sacar(double saque) {
    if(isStatus()){
      if(this.getSaldo() >= saque) {
        this.saldo = this.getSaldo() - saque;
        System.out.println("Saque realizado na conta de " + this.getDonoConta());
      } else {
        System.out.println("Saldo insuficiente");
      }
    } else {
      System.out.println("A conta não está ativa");
    }
  }

  public void pagarMensal() {
    int valorPagarMensalidade = 0;
    if (this.getTipo().equals("CC")) {
      valorPagarMensalidade = 20;
    } else if ("CP".equals(this.getTipo())) {
      valorPagarMensalidade = 12;
    }
    if (this.isStatus()){
      this.setSaldo(this.getSaldo() - valorPagarMensalidade);
      System.out.println("Mensalidade paga por, " + this.getDonoConta());
    } else {
      System.out.println("Está conta pode estar inativa ou em débito");
    }
  }

  /**
   * @Métodos especiais
   */
  public void setNumeroConta(int numero) {
    this.numero = numero;
  }
  public int getNumeroConta(){
    return this.numero;
  }

  public void setDonoConta(String dono){
    this.dono = dono;
  }
  public String getDonoConta(){
    return this.dono;
  }

  public void setSaldo(double valor) {
    this.saldo += valor;
  }
  public double getSaldo(){
    return this.saldo;
  }

  public void setStatus(boolean setStatusConta) {
    this.status = setStatusConta;
  }
  public boolean isStatus(){
    return this.status;
  }

  public void setTipo(String tipoConta) {
    this.tipo = tipoConta;
  }
  public String getTipo(){
    return this.tipo;
  }

  public void getActualStateAccount(){
    System.out.println("\n======================================");
    System.out.println("Conta: " + this.getNumeroConta());
    System.out.println("Dono: " + this.getDonoConta());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.isStatus());
    System.out.println("Tipo: " + this.getTipo());
  }
}
package com.clientedaconta;

public class ClienteDaConta {
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

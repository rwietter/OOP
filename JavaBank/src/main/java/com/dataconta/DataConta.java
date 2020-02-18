package com.dataconta;

public class DataConta {
  private int dia;
  private int mes;
  private int ano;

  public boolean setDia(int dia) {
    this.dia = dia;
    return true;
  }

  public int getDia() {
    return this.dia;
  }

  public boolean setMes(int mes) {
    this.mes = mes;
    return true;
  }

  public int getMes() {
    return this.mes;
  }

  public boolean setAno(int ano) {
    this.ano = ano;
    return true;
  }

  public int getAno() {
    return this.ano;
  }

  public String dataFormatada() {
    String dia = Integer.toString(this.getDia());
    String mes = Integer.toString(this.getMes());
    String ano = Integer.toString(this.getAno());
    String data = dia + "/" + mes + "/" + ano;
    return data;
  }
}

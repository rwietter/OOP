package object_oriented_programming.caneta_encapsulamento;

import java.lang.reflect.Constructor;

public class Caneta {
  private String modelo;
  private String cor;
  private float ponta;
  protected int carga;
  protected boolean tampada;

  // Constructor => inicializa métodos ou variáveis
  protected Caneta(boolean tampa) {
    this.setTampar(tampa);
  }


  // Setters
  protected void setRabiscar() {
    if (tampada) {
      System.out.println("Caneta tampada");
    } else {
      System.out.println("Rabisco");
    }
  }

  protected void setTampar(boolean boolTampa) {
    this.tampada = boolTampa;
  }

  protected void setModelo(String model) {
    this.modelo = model;
  }

  protected void setCor(String color) {
    this.cor = color;
  }

  protected void setPonta(float pontaCaneta) {
    this.ponta = pontaCaneta;
  }

  protected void setCarga(int Carga) {
    this.carga = Carga;
  }


  // Getters
  protected String getModelo() {
    return this.modelo;
  }

  protected String getCor() {
    return this.cor;
  }

  protected float getPonta() {
    return this.ponta;
  }

  protected Boolean getTampa() {
    return this.tampada;
  }

  protected int getCarga() {
    return this.carga;
  }
}

package com.polymorphism;

/**
 * @author Mauricio
 */
public class Fish extends Animal {

  private String corEscama;
  @Override
  public void locomover() {
    System.out.println("Peixe nadando");
  }

  @Override
  public void alimentar() {
    System.out.println("Peixe comendo");
  }

  @Override
  public void emitirSom() {
    System.out.println("Não emite som");
  }
  public void soltarBolha(){
    System.out.println("Soltou bolha");
  }
}

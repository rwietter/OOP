package com.polymorphism;

public class Mamifero extends Animal {
  private String corPelo;

  @Override
  public void locomover(){
    System.out.println("Correndo");
  };
  @Override
  public void alimentar(){
    System.out.println("Comendo");
  };
  @Override
  public void emitirSom(){
    System.out.println("Som de mamifero");
  };
}

class Canguru extends Mamifero {
    public void usarBolsa(){
      System.out.println("Cangurro Bolsa");
    }

    @Override
    public void locomover(){
      System.out.println("Pular");
    }
}
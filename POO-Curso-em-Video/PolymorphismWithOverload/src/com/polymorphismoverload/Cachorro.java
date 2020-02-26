package com.polymorphismoverload;

public class Cachorro extends Lobo {
  @Override
  public void emitirSom(){
    System.out.println("som de cão");
  }
  public void reagir(String frase){
    System.out.println(frase);
  }
  public void reagir(boolean fome){
    System.out.println(fome);
  }
  public void reagir(int hora, int min){
    System.out.println(hora + min);
  }
}

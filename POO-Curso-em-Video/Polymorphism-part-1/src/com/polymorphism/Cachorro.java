package com.polymorphism;

public class Cachorro extends Mamifero {
  public void reagir(String frase){
    if ((frase == "toma comida") || ("Olá" == frase)) {
      System.out.println("Abanar e latir");
    } else {
      System.out.println("rosnar");
    }
  }
  public void reagir(int hora, int min){
    if(hora < 12){
      System.out.println("Abanar");
    } else if(hora >= 18){
      System.out.println("Ignorar");
    } else {
      System.out.println("Abanar e latir");
    }
  }
}

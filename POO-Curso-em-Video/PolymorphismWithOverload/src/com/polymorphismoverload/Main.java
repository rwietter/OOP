package com.polymorphismoverload;

/**
 * @author Mauricio
 */
public class Main {

    public static void main(String[] args) {
      Mamifero mamifero = new Mamifero();
      mamifero.emitirSom();
      Lobo lobo = new Lobo();
      lobo.emitirSom();
    }
}

package com.polymorphism;

/**
 * @author Mauricio
 */
public class Main {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        mamifero.alimentar();

        Reptil reptil = new Reptil();
        reptil.emitirSom();

        Fish fish = new Fish();
        fish.locomover();

        Canguru canguru = new Canguru();
        canguru.locomover();

        Cobra cobra = new Cobra();
        cobra.locomover();

        Cachorro cachorro = new Cachorro();
        cachorro.reagir("Olá");
        cachorro.reagir(21, 34);
    }
}

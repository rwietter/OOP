package com.interfaceobject;
/**
 * @author Mauricio
 */
public class Main {
    public static void main(String[] args) {
        ControleRemoto control = new ControleRemoto();
        control.desligar();
        control.maisVolume();
        control.abrirMenu();
        control.fecharMenu();

        control.ligarMudo();
        control.abrirMenu();
        control.play();
        control.pause();
    }
}
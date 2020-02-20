package com.relationship;

public class Main {

    public static void main(String[] args) {
	      Lutador[] lutador = new Lutador[3];

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

        for(Lutador l:lutador){
            l.apresentar();
        }

        Luta luta = new Luta();
        luta.marcarLuta(lutador[0], lutador[1]);
        luta.lutar();

        for(Lutador l:lutador){
            l.status();
        }
    }
}

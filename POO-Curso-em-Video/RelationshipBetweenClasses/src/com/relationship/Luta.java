package com.relationship;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador mano, Lutador lek){
        if(mano.getCategoria().equals(lek.getCategoria()) && mano != lek){
            this.setAprovado(true);
            this.setDesafiado(mano);
            this.setDesafiante(lek);
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            throw new IllegalStateException("A categoria dos lutadores difere uma da outra");
        }
    }
    public void lutar() throws IllegalStateException {
        if(this.isAprovado()){
            System.out.println("\n============ LUTA ============");
            System.out.println("Desafiante, " + this.desafiante.getNome() + " Vs " + desafiado.getNome() + ", desafiado");
            System.out.print("A luta vai começar em ");
            for (int i = 5; i >= 1; i--) {
                System.out.print("..." + i);
            }
            int vitorias = this.getRandomNumberInRange(0, 2);
            switch (vitorias){
                case 0:
                    System.out.println("\nUm empate aconteceu entre " + this.desafiado.getNome() + " e " + this.desafiante.getNome());
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("\nO " + this.desafiado.getNome() + " ganhou a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("\nO " + this.desafiante.getNome() + " ganhou a luta");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                default:
                    System.out.println("\nLuta não aconteceu");
            }
        } else {
            System.out.println("\nLuta não aprovada");;
        }
    }

    public int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            System.out.println("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
}

package com.interfaceobject;

class ControleRemoto implements Controlador {
  private int volume;
  private boolean ligado;
  private boolean tocando;

  /* Constructor */
  public ControleRemoto(){
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }

  /* Interfaces */
  @Override
  public void ligar() {
  this.setLigado(true);
  }

  @Override
  public void desligar(){
    this.setLigado(false);
  };

  @Override
  public void abrirMenu(){
    System.out.println("\n\nAbrindo Menu...");
    System.out.println("Está ligado ? " + this.getLigado());
    System.out.println("Está tocando ? " + this.getTocando());
    System.out.print("Volume: " + this.getVolume() + "%");
    int volumePerPlus = 5;
    for (int i = 0; i < this.getVolume(); i += volumePerPlus) {
      System.out.print(" |");
    }
  };

  @Override
  public void fecharMenu(){
    System.out.println("\nFechando menu....");
  };

  @Override
  public void maisVolume(){
    if(this.getLigado()){
      this.setVolume(this.getVolume() + 5);
    }
  };

  @Override
  public void menosVolume(){
    if(this.getLigado()){
      this.setVolume(this.getVolume() - 5);
    }
  };

  @Override
  public void ligarMudo(){
    if (this.getLigado() && this.getVolume() > 0){
      this.setVolume(0);
    }
  };

  @Override
  public void desligarMudo(){
    if(this.getLigado() && this.getVolume() == 0){
      this.setVolume(50);
    }
  };

  @Override
  public void play(){
    if (this.getLigado() && !this.getTocando()) {
      this.setTocando(true);
      System.out.println("\nPlay");
    } else {
      System.out.println("\nNão foi possível dar play.");
    }
  };

  @Override
  public void pause(){
    if(this.getLigado() && this.getTocando()){
      this.setTocando(false);
      System.out.println("Pause ativado");
    } else {
      System.out.println("Não foi possível pausar");
    }
  };

  /* métodos especiais */
  private void setVolume(int value) {
    this.volume = value;
  }
  private int getVolume(){
    return this.volume;
  }

  private void setLigado(boolean value) {
    this.ligado = value;
  }
  private boolean getLigado(){
    return this.ligado;
  }

  private void setTocando(boolean value) {
    this.tocando = value;
  }
  private boolean getTocando() {
    return this.tocando;
  }
}
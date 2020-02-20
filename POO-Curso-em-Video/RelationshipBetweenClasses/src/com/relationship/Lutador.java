package com.relationship;

import static java.lang.System.*;

/**
 * @author Mauricio
 */
public class Lutador {
  private String nome, nacionalidade, categoria;
  private int idade;
  private float altura, peso;
  private int vitorias, derrotas, empate;

  /**
   * @Constructor
   */
  public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empate){
    setNome(nome);
    setNacionalidade(nacionalidade);
    setIdade(idade);
    setAltura(altura);
    setPeso(peso);
    setVitorias(vitorias);
    setDerrotas(derrotas);
    setEmpate(empate);
  }

  /**
  * @Methods
  */
  public void setNome(String nomeLutador){
    this.nome = nomeLutador;
  }
  public String getNome(){
    return this.nome;
  }

  public void setNacionalidade(String nacionalidadeLutador){
    this.nacionalidade = nacionalidadeLutador;
  }
  public String getNacionalidade(){
    return this.nacionalidade;
  }

  private void setCategoria(){
    if(this.getPeso() <= 52.5){
      this.categoria = "Está categoria não existe";
    } else if(this.getPeso() <= 70.3){
      this.categoria = "Leve";
    } else if(this.getPeso() <= 83.9){
      this.categoria = "Medio";
    } else if (this.getPeso() <= 120.0){
      this.categoria = "Pesado";
    } else {
      this.categoria = "Inválida";
    }
  }
  public String getCategoria(){
    return this.categoria;
  }

  public void setIdade(int idadeLutador){
    this.idade = idadeLutador;
  }
  public int getIdade(){
    return this.idade;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }
  public float getAltura() {
    return this.altura;
  }

  public void setPeso(float peso) {
    this.peso = peso;
    this.setCategoria();
  }
  public float getPeso() {
    return this.peso;
  }

  public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
  }
  public int getVitorias(){
    return this.vitorias;
  }

  public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
  }
  public int getDerrotas(){
    return this.derrotas;
  }

  private void setEmpate(int empate) {
    this.empate = empate;
  }
  public int getEmpate(){
    return this.empate;
  }


  /**
   * @Special methods
   *
   */
  public void apresentar(){
    out.println("\nApresentando o lutador.........");
    out.println("Lutador: " + this.getNome());
    out.println("Origem: " + this.getNacionalidade());
    out.println("Idade:" + this.getIdade() + " anos");
    out.println("Altura: " + this.getAltura() + " m");
    out.println("Pesando: " + this.getPeso() + " Kg");
    out.println("Ganhou: " + this.getVitorias() + " combates");
    out.println("Perdeu: " + this.getDerrotas() + " combates");
    out.println("Empatou: " + this.getEmpate() + " combates");
  }
  public void status(){
      out.println("\n============= Status dos lutadores ===========");
    out.println("Nome: " + this.getNome());
    out.println("A categoria é peso: " + this.getCategoria());
    out.println("Vitórias: " + this.getVitorias());
    out.println("Derrotas: " + this.getDerrotas());
    out.println("Empates: " + this.getEmpate());
  }
  public void ganharLuta(){
    this.setVitorias(this.getVitorias() + 1);
  }
  public void perderLuta(){
    this.setDerrotas(this.getVitorias() - 1);
  }
  public void empatarLuta(){
    this.setEmpate(this.getEmpate() + 1);
  }
}

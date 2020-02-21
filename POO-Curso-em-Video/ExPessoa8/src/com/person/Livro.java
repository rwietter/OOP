package com.person;

public class Livro implements Publicacao{
  private String titulo;
  private String autor;
  private int totPaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setTotPaginas(totPaginas);
    this.setAberto(false);
    this.setPagAtual(0);
    this.setLeitor(leitor);
  }

  public String detalhesLivro() {
    return "Livro" +
        "{\n" + "titulo: '" + titulo + '\''
        + ",\nautor: '" + autor + '\''
        + ",\ntotPaginas: " + totPaginas
        + ",\naberto: " + aberto
        + ",\nleitor: " + leitor.getNome()
        + ",\nPagina atual: " + this.getPagAtual() +
    '}';
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }


  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTotPaginas() {
    return totPaginas;
  }

  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }

  public boolean isAberto() {
    return aberto;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public int getPagAtual() {
    return pagAtual;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  /* Interface methods */
  @Override
  public void abrir() {
    this.setAberto(true);
  }

  @Override
  public void fechar() {
    this.setAberto(false);
  }

  @Override
  public void folhear(int pag) {
    if(pag > this.getTotPaginas()){
      System.out.println("Voce chegou no final do livro.");
    } else if (pag < 0){
      System.out.println("Você está no início do livro, avance para ler!");
    } else {
      this.setPagAtual(pag);
    }
  }

  @Override
  public void avancarPag() {
    if(this.getPagAtual() < this.getTotPaginas() && this.getPagAtual() >= 0) {
      this.setPagAtual(this.getPagAtual() + 1);
    } else {
      System.out.println("Você chegou ao fim do livro!");
    }
  }

  @Override
  public void voltarPag() {
    if(this.getPagAtual() < 0 || this.getTotPaginas() < 0){
      System.out.println("Você está no início do livro, folhar pagina para ir para próxima.");
    } else {
      this.setPagAtual(this.getPagAtual() - 1);
    }
  }
}

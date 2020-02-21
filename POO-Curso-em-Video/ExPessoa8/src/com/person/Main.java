package com.person;

public class Main {

    public static void main(String[] args) {
      String nome = "Carlo"; int idade = 55; String sexo = "M";
      Pessoa[] p = new Pessoa[3];
      p[0] = new Pessoa(nome, idade, sexo);
      p[1] = new Pessoa("Luana", 20, "F");
      p[2] = new Pessoa("Carol Danvers", 28, "F");


      Livro[] l = new Livro[3];
      l[0] = new Livro("Buracos Negros", "Stephen Hawking", 290, p[2]);
      l[1] = new Livro("O Universo numa Casca de Noz", "Stephen Hawking", 400, p[0]);
      l[2] = new Livro("Uma Breve História do Tempo", "Stephen Hawking", 380, p[1]);

      l[0].abrir();
      l[0].folhear(50);
      l[0].avancarPag();

      System.out.println(l[0].detalhesLivro());

    }
}

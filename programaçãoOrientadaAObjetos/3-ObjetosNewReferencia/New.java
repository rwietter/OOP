// New object

class Conta {
  Boolean y;
  double value;
}

class New {
  public static void main(String[] args) {
    Conta c1; // c1 se refere a um objeto, ele não é um objeto
    Conta c2;
    c1 = new Conta(); // 	"Tenho	uma	referência	c	a	um	objeto	do tipo	Conta".

    c2 = c1; // c2 e c1 apontam para o mesmo local na memória, mas não para o objeto

    if (c1 == c2) {
      System.out.println("Iguais");
    } else {
      System.out.println("Diferentes");
    }
  }
}





/*

=> Diferente dos tipos primitivos. para guardar referência de um objeto, usamos new();
=> Basta lembrar que, em Java, uma variável nunca	é	um	objeto.	Não	há,	no Java, uma
maneira	de criarmos	o	que	é	conhecido	como "objeto pilha"	ou "objeto local", pois todo
objeto em Java, sem exceção, é acessado	por	uma	variável referência.

=> New = aloca memória para um objeto, devolve um "ponteiro", um valor de referência.

=> Para	saber	se dois	objetos	têm	o	mesmo	conteúdo,	você precisa comparar	atributo por atributo. 
*/

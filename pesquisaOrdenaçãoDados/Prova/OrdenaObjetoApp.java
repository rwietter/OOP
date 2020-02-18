/*
 * Pesquisa e OrdenaÃ§Ã£o de Dados
 */
package ordenaObjeto;

import ordenaObjeto.Contatos;

/**
 *
 * @author joel
 */
public class OrdenaObjetoApp {
  public static void main(String[] args) {
    int tamanho = 10;
    Contatos c;
    c = new Contatos(tamanho);
    Gerador g = new Gerador();
    int id = 1;
    for (int i = 0; i < tamanho; i++) {
      c.inserePessoa(id, g.geraNome(), g.geraSobrenome(), g.geraIdade());
      id++;
    }

    System.out.println("==== Antes da OrdenaÃ§Ã£o ====");
    c.imprimeContatos();
    // c.insertionSort(0); // para ordenar por idade
    // c.insertionSort(1); //para ordenar por sobrenome
    // c.insertionSort(2); //para ordenar por nome

    // c.SelectionSort(0);// para ordenar por idade
    // c.SelectionSort(1);// para ordenar por sobrenome
    // c.SelectionSort(2);// para ordenar por nome

    // c.BubbleSort(0);// para ordenar por idade
    // c.BubbleSort(1);// para ordenar por sobrenome
    // c.BubbleSort(2);// para ordenar por nome

    // c.ShellSort(0);// para ordenar por idade
    // c.ShellSort(1);// para ordenar por sobrenome
    // c.ShellSort(2);// para ordenar por nome

    // c.QuickSort(c.getVC(),0,c.getNumContatos()-1,0); //para ordenar por idade
    // c.QuickSort(c.getVC(),0,c.getNumContatos()-1,1); // para ordenar por
    // sobrenome
    // c.QuickSort(c.getVC(),0,c.getNumContatos()-1,2); // para ordenar por nome

    // c.HeapSort(c.getVC(),0); // para ordenar por idade
    // c.HeapSort(c.getVC(),1); // para ordenar por sobrenome
    // c.HeapSort(c.getVC(),2);// para ordenar por nome

    // c.MergeSort(c.getVC(),0,c.getNumContatos()-1,0); // para ordenar por idade
    // c.MergeSort(c.getVC(),0,c.getNumContatos()-1,1); // para ordenar por
    // sobrenome
    c.MergeSort(c.getVC(), 0, c.getNumContatos() - 1, 2); // para ordenar por nome

    System.out.println("=== Depois da OrdenaÃ§Ã£o===");
    c.imprimeContatos();

  }
}

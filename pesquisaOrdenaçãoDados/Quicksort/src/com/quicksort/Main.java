package com.quicksort;

/**
 * @author Mauricio
 */
public class Main {
  int partition(int[] array, int esq, int dir) {
    // pivot é o elemento da direita
    int pivot = array[dir];
    // i começa na esquerda
    int i = (esq - 1);

    for (int j = esq; j < dir; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    int temp = array[i + 1];
    array[i + 1] = array[dir];
    array[dir] = temp;
    return (i + 1);
  }

  void quickSort(int[] array, int esq, int dir) {
    // quickSort seleciona o pivô e ordena menores para esquerda e maiores para direita
    // recursividade continua até a direita cruzar com a esquerda
    if (esq < dir) {
      // partition irá selecionar o pivô e por a esq elementos menores e a dir elementos maiores
      int pi = partition(array, esq, dir);
      // chamada recursiva para ordenar da esquerda até pi-1
      quickSort(array, esq, pi - 1);
      // chamada recursiva para ordenar de j+1 para a direita
      quickSort(array, pi + 1, dir);
    }
  }

  public static void main(String[] args) {
    int[] arr = {7,4,14};
    int arrSize = arr.length;
    Main qsort = new Main();
    qsort.quickSort(arr, 0, arrSize - 1);
    for(int iterator : arr) {
      System.out.println(iterator);
    }
  }
}

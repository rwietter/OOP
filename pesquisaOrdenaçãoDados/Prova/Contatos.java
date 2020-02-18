/*
 *Pesquisa e OrdenaÃ§Ã£o de Dados
 */
package ordenaObjeto;

/**
 *
 * @author joel
 */
public class Contatos {
  private Pessoa[] vc; // vetor de contatos
  private int numContatos; // nÃºmero de contatos

  /**
   * Construtor
   */
  public Contatos(int tamanho) {
    vc = new Pessoa[tamanho];
    this.numContatos = 0;
  }

  /**
   * Insere uma pessoa no vetor
   */
  public void inserePessoa(int id, String nome, String sobrenome, int idade) {
    vc[numContatos] = new Pessoa(id, nome, sobrenome, idade);
    numContatos++;
  }

  /**
   * Imprime o conteÃºdo do vetor
   */
  public void imprimeContatos() {
    for (int i = 0; i < numContatos; i++) {
      vc[i].imprimePessoa();
      System.out.println(" ");
    }
  }

  /*
   * retorna o vetor de contatos
   */
  public Pessoa[] getVC() {
    return this.vc;
  }

  /*
   * retorna o vetor de contatos
   */
  public int getNumContatos() {
    return this.numContatos;
  }

  /*
   * ================ InÃ­cio das ImplementaÃ§Ãµes dos Algoritmos
   * =======================
   */

  /**
   * Ordena o vetor com o mÃ©todo insertion sort, considerando o atributo definido
   * no parÃ¢metro a = 0 para ordenar por idade a = 1 para ordenar por Sobrenome a
   * = 2 para ordenar por Nome
   */

  public void insertionSort(int a) {

    if (a == 0) {
      for (int i = 1; i < this.numContatos; ++i) {
        Pessoa key = vc[i];
        int j = i - 1;

        while (j >= 0 && vc[j].getIdade() > key.getIdade()) // para ordenar por idade
        {
          vc[j + 1] = vc[j];
          j = j - 1;
        }
        vc[j + 1] = key;
      }
    } else if (a == 1) {
      for (int i = 1; i < this.numContatos; ++i) {
        Pessoa key = vc[i];
        int j = i - 1;

        while (j >= 0 && ((vc[j].getSobrenome().compareTo(key.getSobrenome())) > 0)) // para ordenar por Sobrenome
        {
          vc[j + 1] = vc[j];
          j = j - 1;
        }
        vc[j + 1] = key;
      }
    } else {
      for (int i = 1; i < this.numContatos; ++i) {
        Pessoa key = vc[i];
        int j = i - 1;

        while (j >= 0 && ((vc[j].getNome().compareTo(key.getNome())) > 0)) // para ordenar por Sobrenome
        {
          vc[j + 1] = vc[j];
          j = j - 1;
        }
        vc[j + 1] = key;
      }
    }
  }// final insertion

  /**
   * Ordena o vetor com o mÃ©todo insertion sort, considerando o atributo definido
   * no parÃ¢metro a = 0 para ordenar por idade a = 1 para ordenar por Sobrenome a
   * = 2 para ordenar por Nome
   */

  public void SelectionSort(int a) {
    Pessoa aux;
    int i, j, menor_idx, n;
    n = numContatos;

    if (a == 0) {
      for (i = 0; i < n - 1; i++) {
        // Encontra o Ã­ndice do menor elemento do vetor
        menor_idx = i;

        for (j = i + 1; j < n; j++)
          if (vc[j].getIdade() < vc[menor_idx].getIdade()) {
            menor_idx = j;
          }
        // efetua a troca
        aux = vc[menor_idx];
        vc[menor_idx] = vc[i];
        vc[i] = aux;

      }
    } else if (a == 1) {
      for (i = 0; i < n - 1; i++) {
        // Encontra o Ã­ndice do menor elemento do vetor
        menor_idx = i;

        for (j = i + 1; j < n; j++)
          if (((vc[j].getSobrenome().compareTo(vc[menor_idx].getSobrenome())) < 0)) {
            menor_idx = j;
          }
        // efetua a troca
        aux = vc[menor_idx];
        vc[menor_idx] = vc[i];
        vc[i] = aux;

      }
    } else {
      for (i = 0; i < n - 1; i++) {
        // Encontra o Ã­ndice do menor elemento do vetor
        menor_idx = i;

        for (j = i + 1; j < n; j++)
          if (((vc[j].getNome().compareTo(vc[menor_idx].getNome())) < 0)) {
            menor_idx = j;
          }
        // efetua a troca
        aux = vc[menor_idx];
        vc[menor_idx] = vc[i];
        vc[i] = aux;

      }
    }
  } // final selection sort

  /**
   * Ordena o vetor com o mÃ©todo Bubble Sort, considerando o atributo definido no
   * parÃ¢metro a = 0 para ordenar por idade a = 1 para ordenar por Sobrenome a =
   * 2 para ordenar por Nome
   */

  public void BubbleSort(int a) {
    int n = numContatos;
    Pessoa aux;
    int i, j;
    if (a == 0) {
      for (i = n - 1; i > 0; i--) {
        for (j = 0; j < i; j++) {
          if (vc[j].getIdade() > vc[j + 1].getIdade()) {
            aux = vc[j];
            vc[j] = vc[j + 1];
            vc[j + 1] = aux;
          }
        }
      }
    } else if (a == 1) {
      for (i = n - 1; i > 0; i--) {
        for (j = 0; j < i; j++) {
          if (((vc[j].getSobrenome().compareTo(vc[j + 1].getSobrenome())) > 0)) {
            aux = vc[j];
            vc[j] = vc[j + 1];
            vc[j + 1] = aux;
          }
        }
      }
    } else {
      for (i = n - 1; i > 0; i--) {
        for (j = 0; j < i; j++) {
          if (((vc[j].getNome().compareTo(vc[j + 1].getNome())) > 0)) {
            aux = vc[j];
            vc[j] = vc[j + 1];
            vc[j + 1] = aux;
          }
        }
      }
    }
  }

  /**
   * Ordena o vetor com o mÃ©todo Shell Sort, considerando o atributo definido no
   * parÃ¢metro a = 0 para ordenar por idade a = 1 para ordenar por Sobrenome a =
   * 2 para ordenar por Nome
   */
  public void ShellSort(int a) {
    int h = 1;
    int n = numContatos;

    while (h < n) {
      h = h * 3 + 1;
    }

    h = h / 3;
    int j;
    Pessoa aux;
    while (h > 0) {
      for (int i = h; i < n; i++) {
        aux = vc[i];
        j = i;
        while (j >= h && vc[j - h].getIdade() > aux.getIdade()) {
          vc[j] = vc[j - h];
          j = j - h;
        }
        vc[j] = aux;
      }
      h = h / 2;
    }
  }

  /**
   * Ordena o vetor com o mÃ©todo Quick Sort, considerando o atributo definido no
   * parÃ¢metro a = 0 para ordenar por idade a = 1 para ordenar por Sobrenome a =
   * 2 para ordenar por Nome
   */
  public void QuickSort(Pessoa[] v, int esquerda, int direita, int a) {

    int e = esquerda;
    int d = direita;

    Pessoa pivo = v[(e + d) / 2];
    Pessoa aux;

    if (a == 0) {
      while (e <= d) {
        while (v[e].getIdade() < pivo.getIdade()) {
          e = e + 1;
        }
        while (v[d].getIdade() > pivo.getIdade()) {
          d = d - 1;
        }
        if (e <= d) {
          aux = v[e];
          v[e] = v[d];
          v[d] = aux;
          e = e + 1;
          d = d - 1;
        }
      }

    } else if (a == 1) {
      while (e <= d) {
        while (((v[e].getSobrenome().compareTo(pivo.getSobrenome())) < 0)) {
          e = e + 1;
        }
        while (((v[d].getSobrenome().compareTo(pivo.getSobrenome())) > 0)) {
          d = d - 1;
        }
        if (e <= d) {
          aux = v[e];
          v[e] = v[d];
          v[d] = aux;
          e = e + 1;
          d = d - 1;
        }
      }

    } else {
      while (e <= d) {
        while (((v[e].getNome().compareTo(pivo.getNome())) < 0)) {
          e = e + 1;
        }
        while (((v[d].getNome().compareTo(pivo.getNome())) > 0)) {
          d = d - 1;
        }
        if (e <= d) {
          aux = v[e];
          v[e] = v[d];
          v[d] = aux;
          e = e + 1;
          d = d - 1;
        }
      }
    }

    if (d > esquerda) {
      QuickSort(v, esquerda, d, a);
    }
    if (e < direita) {
      QuickSort(v, e, direita, a);
    }

  }// final quick sort

  /**
   * Ordena o vetor com o mÃ©todo Heap Sort, considerando o atributo definido no
   * parÃ¢metro a = 0 para ordenar por idade a = 1 para ordenar por Sobrenome a =
   * 2 para ordenar por Nome
   */

  public void HeapSort(Pessoa[] v, int a) {
    int tamanho = v.length;
    System.out.println(a);
    // Build heap
    for (int i = tamanho / 2 - 1; i >= 0; i--)
      heapify(v, tamanho, i, a);

    // One by one extract (Max) an element from heap and
    // replace it with the last element in the array
    for (int i = tamanho - 1; i >= 0; i--) {

      // arrA[0] is a root of the heap and is the max element in heap
      Pessoa x = v[0];
      v[0] = v[i];
      v[i] = x;

      // call max heapify on the reduced heap
      heapify(v, i, 0, a);
    }
  }

  // To heapify a subtree with node i
  static void heapify(Pessoa arrA[], int heapSize, int i, int a) {
    int largest = i; // Initialize largest as root
    int leftChildIdx = 2 * i + 1; // left = 2*i + 1
    int rightChildIdx = 2 * i + 2; // right = 2*i + 2

    if (a == 0) {
      // If left child is larger than root
      if (leftChildIdx < heapSize && arrA[leftChildIdx].getIdade() > arrA[largest].getIdade())
        largest = leftChildIdx;

      // If right child is larger than largest so far
      if (rightChildIdx < heapSize && arrA[rightChildIdx].getIdade() > arrA[largest].getIdade())
        largest = rightChildIdx;

      // If largest is not root
      if (largest != i) {
        Pessoa swap = arrA[i];
        arrA[i] = arrA[largest];
        arrA[largest] = swap;

        // Recursive call to heapify the sub-tree
        heapify(arrA, heapSize, largest, a);
      }
    } else if (a == 1) {
      // If left child is larger than root
      if (leftChildIdx < heapSize && (arrA[leftChildIdx].getSobrenome().compareTo(arrA[largest].getSobrenome()) > 0))
        largest = leftChildIdx;

      // If right child is larger than largest so far
      if (rightChildIdx < heapSize && (arrA[rightChildIdx].getSobrenome().compareTo(arrA[largest].getSobrenome()) > 0))
        largest = rightChildIdx;

      // If largest is not root
      if (largest != i) {
        Pessoa swap = arrA[i];
        arrA[i] = arrA[largest];
        arrA[largest] = swap;

        // Recursive call to heapify the sub-tree
        heapify(arrA, heapSize, largest, a);
      }
    } else {
      // If left child is larger than root
      if (leftChildIdx < heapSize && (arrA[leftChildIdx].getNome().compareTo(arrA[largest].getNome()) > 0))
        largest = leftChildIdx;

      // If right child is larger than largest so far
      if (rightChildIdx < heapSize && (arrA[rightChildIdx].getNome().compareTo(arrA[largest].getNome()) > 0))
        largest = rightChildIdx;

      // If largest is not root
      if (largest != i) {
        Pessoa swap = arrA[i];
        arrA[i] = arrA[largest];
        arrA[largest] = swap;

        // Recursive call to heapify the sub-tree
        heapify(arrA, heapSize, largest, a);
      }
    }
  }

  /**
   * Fim do HeapSort
   */

  /**
   * Ordena o vetor com o mÃ©todo Heap Sort, considerando o atributo definido no
   * parÃ¢metro a = 0 para ordenar por idade a = 1 para ordenar por Sobrenome a =
   * 2 para ordenar por Nome
   */

  public void MergeSort(Pessoa v[], int esquerda, int direita, int a) {
    if (esquerda < direita) {
      // Find the middle point
      int m = (esquerda + direita) / 2;

      // Sort first and second halves
      MergeSort(v, esquerda, m, a);
      MergeSort(v, m + 1, direita, a);

      // Merge the sorted halves
      merge(v, esquerda, m, direita, a);
    }
  }

  /**
   * Merges two subarrays of arr[]. First subarray is arr[l..m] Second subarray is
   * arr[m+1..r]
   */
  static void merge(Pessoa[] v, int esquerda, int m, int direita, int a) {
    // Find sizes of two subarrays to be merged
    int n1 = m - esquerda + 1;
    int n2 = direita - m;

    /* Create temp arrays */
    Pessoa L[] = new Pessoa[n1];
    Pessoa R[] = new Pessoa[n2];

    /* Copy data to temp arrays */
    for (int i = 0; i < n1; ++i)
      L[i] = v[esquerda + i];
    for (int j = 0; j < n2; ++j)
      R[j] = v[m + 1 + j];

    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarry array
    int k = esquerda;
    while (i < n1 && j < n2) {
      if (a == 0) {
        if (L[i].getIdade() <= R[j].getIdade()) {
          v[k] = L[i];
          i++;
        } else {
          v[k] = R[j];
          j++;
        }
        k++;
      } else if (a == 1) {
        if (L[i].getSobrenome().compareTo(R[j].getSobrenome()) <= 0) {
          v[k] = L[i];
          i++;
        } else {
          v[k] = R[j];
          j++;
        }
        k++;
      } else {
        if (L[i].getNome().compareTo(R[j].getNome()) <= 0) {
          v[k] = L[i];
          i++;
        } else {
          v[k] = R[j];
          j++;
        }
        k++;
      }
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1) {
      v[k] = L[i];
      i++;
      k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2) {
      v[k] = R[j];
      j++;
      k++;
    }
  } // fim merge

} // final classe

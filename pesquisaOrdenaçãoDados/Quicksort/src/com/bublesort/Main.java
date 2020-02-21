package com.bublesort;

/**
 * @author Mauricio
 */
public class Main {
  int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return (i + 1);
  }

  void quickSort(int[] array, int low, int high) {
    if (low < high) {
      int pi = partition(array, low, high);
      quickSort(array, low, pi - 1);
      quickSort(array, pi + 1, high);
    }
  }

  void printArray(int[] array, int size) {
    for (int i = 0; i < size; ++i)
      System.out.print(array[i] + " ");
    System.out.println();
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

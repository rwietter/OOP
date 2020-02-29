package com.heapsort;

/**
 * @author Mauricio
 */
public class Main {

    public void sort(int[] arr){
      int maxIndexArray = arr.length;
      // Build max heap
      for(int i = maxIndexArray / 2 - 1; i >= 0; i--){
        heapify(arr, maxIndexArray, i);
      }
      // Heapsort
      for(int i = maxIndexArray - 1; i >= 0; i--){
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        // heapfy root element
        heapify(arr, i, 0);
      }
    }

    void heapify(int[] arr, int maxIndexArray, int index){
      // Find largest among root, left child and right child
      int largest = index;
      int left = 2 * index + 1;
      int right = 2 * index + 2;

      if(left < maxIndexArray && arr[left] > arr[largest]) {
        largest = left;
      }
      if(right < maxIndexArray && arr[right] > arr[largest]){
        largest = right;
      }
      // Swap and continue heapfying if root is not largest
      if(largest != index) {
        int swap = arr[index];
        arr[index] = arr[largest];
        arr[largest] = swap;
        heapify(arr, maxIndexArray, largest);
      }
    }

    static void printArray(int[] arr){
      int maxIndexArray = arr.length;
      for(int i = 0; i < maxIndexArray; ++i){
        System.out.println(arr[i] + " ");
      }
      System.out.println();
    }

    public static void main(String[] args) {
      int[] arrForSort = {1, 12, 9, 5, 6, 10};
      Main hs = new Main();
      hs.sort(arrForSort);
      System.out.println("Sorted array is: ");
      printArray(arrForSort);
    }
}

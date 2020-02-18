package com.insertionsort;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr1 = {9,14,3,2,43,11,58,22};
    ArrayToSort.setInsertion(arr1);
    for(int i:arr1){
      System.out.print(i+" ");
    }
  }
}

class ArrayToSort{
  public static void setInsertion(int[] arrayRefVar){
    for (int j = 1; j < arrayRefVar.length; j++) {
      int key = arrayRefVar[j];
      int i = j - 1;
      while ((i > -1) && (arrayRefVar[i] > key)) {
        arrayRefVar[i + 1] = arrayRefVar[i];
        i--;
      }
      arrayRefVar[i+1] = key;
    }
  }
}
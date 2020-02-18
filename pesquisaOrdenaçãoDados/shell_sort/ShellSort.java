package com.shell_sort;

class ShellSort {
  public static void main(String[] args) {
    int[] arr = { 5, 2, 1, 4 };
    Sorting.sort(arr);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}

class Sorting {
  public static void sort(int[] arr) {
    int length = arr.length;
    int divider = 2;
    for (int bag = length / divider; bag > 0; bag = bag / divider) {
      int index;
      for (index = bag; index < length; index = index + 1) {
        int temp = arr[index];
        int sort;
        for (sort = index; sort >= bag && arr[sort - bag] > temp; sort = sort - bag) {
          arr[sort] = arr[sort - bag];
        }
        arr[sort] = temp;
      }
    }
  }
}

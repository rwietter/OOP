public class BubbleSort {
public static void main(String[] args) {
    int[] idades = {12,32,54,6,8,89,1020,64,64,6};
    int len = idades.length;
    for (int i = 0; i < len; i++) {
      for (int j = 1; j < len - i; j++) {
        if (idades[j - 1] > idades[j]) {
          int tmp = idades[j - 1];
          idades[j - 1] = idades[j];
          idades[j] = tmp;
        }
      }
    }
    for (int j = 0; j < idades.length; j++) {
      System.out.println(idades[j]);
    }
  }
}

import java.util.*;

class Main {
  public static void main(String[] args) {
    
    int n= 10;
    int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    quickSort(arr, 0, n-1);

    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
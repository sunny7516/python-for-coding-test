import java.util.*;

class Main {
  public static void main(String[] args) {
    int n = 10;
    int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};    

    for(int i=0; i<n; i++){
      // 가장 작은 원소 인덱스
      int minNum = i;
      for(int j=i+1; j<n; j++){
        if(arr[minNum] > arr[j]){
          // 스와프 
          int tmp = arr[j];
          arr[j] = arr[minNum];
          arr[minNum] = tmp;
        }
      }
    }

    for(int i=0; i<n; i++){
      System.out.print(arr[i]+ " ");
    }
  }
}
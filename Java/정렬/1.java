import java.util.*;

class Main {
  public static void main(String[] args) {
    int n = 10;
    int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8}; 

    for(int i=0; i<n; i++){
      // 기준값 인덱스
      int min_index = i;
      for(int j=i+1; j<n; j++){
        if(arr[min_index] > arr[j]){
          // 가장 작은 인덱스
          min_index = j;
        }
      }
      // 기준값-최솟값 스와프
      int tmp = arr[i];
      arr[i] = arr[min_index];
      arr[min_index] = tmp;
    }

    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}

import java.util.*;

class Main {
  // 삽입정렬 
  public static void main(String[] args) {
    
    int n= 10;
    int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    for(int i=1; i<n; i++){
      // 인덱스 i부터 1까지 감소
      for(int j=i; j>0; j--){
        // 왼쪽으로 이동하면서 비교 
        if(arr[j] < arr[j-1]){
          int tmp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = tmp;
        }
        else break;
      }
    }

    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
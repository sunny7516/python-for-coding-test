import java.util.*;

class Main {
  public static void main(String[] args) {
    int n= 10;
    int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    // 두번째 값부터 확인
    for(int i=1; i<n; i++){
      // 기준값보다 앞에 있는 인덱스만 확인
      for(int j=i; j>0; j--){
        if(arr[j] < arr[j-1]){
          // 기준보다 큰 값 스와프 
          int tmp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = tmp;
        }else{
          // 작은 값이 나오면
          // 그 앞부분은 이미 정렬됨
          break;
        }
      }
    }

    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }

  }
}

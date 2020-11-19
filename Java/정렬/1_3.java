import java.util.*;

class Main {
  // 퀵정렬

  public static void quickSort(int[] arr, int start, int end){
    if(start >= end)return; // 원소 한개면 끝
    int pivot = start; //기준
    int left = start+1;
    int right = end;

    while(left <= right){
      // left가 pivot보다 클 때까지 왼>오 이동
      while(left < end && arr[left] <= arr[pivot])left++;
      // right가 pivot보다 작을 때까지 오>왼 이동
      while(right > start && arr[right] >= arr[pivot])right--;

      // 서로 엇갈리면
      if(left > right){
        // 작은 데이터와 기준 데이터 변경
        int tmp = arr[right];
        arr[right] = arr[pivot];
        arr[pivot] = tmp;
      }else{
        // 엇갈리지 않으면 왼,오 변경
        int tmp = arr[right];
        arr[right] = arr[left];
        arr[left] = tmp;
      }
    }
    // 분할 기준으로 왼쪽 정렬
    quickSort(arr, start, right-1);
    // 분할 기준으로 오른쪽 정렬
    quickSort(arr, right+1, end);
  }

  public static void main(String[] args) {
    int n = 10;
    int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    quickSort(arr, 0, n);

    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
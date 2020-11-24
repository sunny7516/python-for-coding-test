import java.util.*;

// 이진 탐색 (재귀문)
class Main {

  public static int binarySearch(int start, int end, int target, int[] arr){
    if(start > end) return -1;
    int check = (start + end) / 2;
    // 찾은 경우
    if(arr[check] == target){ 
      // 인덱스 반환
      return check; 
    // 중간값보다 찾는 값이 큰 경우 
    }else if(arr[check] < target){
      // 오른쪽 확인
      return binarySearch(check+1, end, target, arr);
    }else{ // 중간값보다 찾는 값이 작은 경우
      // 왼쪽 확인 
      return binarySearch(start, check-1, target, arr);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int target = scan.nextInt();

    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = scan.nextInt();
    }

    int result = binarySearch(0, n-1, target, arr);
    if(result == -1){
      System.out.println("원소가 존재하지 않습니다.");
    }else{
      System.out.println(result + 1);
    }
  }
}
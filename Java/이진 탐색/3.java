import java.util.*;

// 떡볶이 떡 만들기
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(); // 떡의 개수
    int m = scan.nextInt(); // 요청한 떡의 길이 

    // 떡의 개별 높이
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = scan.nextInt();
    }

    int start = 0;
    int end = (int) 1e9;
    // 이진 탐색 수행 결과
    int result = 0;
    
    while(start <= end){
      long total = 0;
      int mid = (start + end) / 2;
      for(int i=0; i<n; i++){
        if(arr[i] > mid) total += arr[i] - mid;
      }
      if(total < m){
        end = mid - 1;
      }else{
        // 최대한 덜 잘랐을 때가 정답
        // result 값 저장
        result = mid;
        start = mid + 1;
      }
    }

    System.out.println(result);
  }
}
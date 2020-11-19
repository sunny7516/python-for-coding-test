import java.util.*;

class Main {
  // cnt 담을 크기
  public static int MAX_VALUE = 9;

  public static void main(String[] args) {
    int n = 15;
    int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
    int[] cnt = new int[MAX_VALUE + 1];

    // 중복 횟수만큼 증가
    for(int i=0; i<n; i++){
      cnt[arr[i]] += 1;
    }

    // 중복 횟수만큼 정렬 조회 
    for(int i=0; i<=MAX_VALUE; i++){
      for(int j=0; j<cnt[i]; j++){
        System.out.print(i + " ");
      }
    }

  }
}
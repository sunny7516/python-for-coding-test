import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(); // 배열 크기
    int m = scan.nextInt(); // 숫자가 더해지는 횟수
    int k = scan.nextInt(); // 연속할 수 있는 횟수
    Integer[] arr = new Integer[n]; // 입력받은 배열
    int result = 0; // 결과값

    int cnt = (m / (k+1)) * k; // 가장 큰 수를 더할 횟수
    cnt +=  m % (k+1);
    m = m - cnt; // 두번째 큰 수를 더할 횟수

    for(int i=0; i<n; i++){
      arr[i] = scan.nextInt();
    }

    Arrays.sort(arr, Collections.reverseOrder()); // 배열 내림차순 정렬

    result += arr[0] * cnt;
    result += arr[1] * m;

    System.out.println(result);
  }
}
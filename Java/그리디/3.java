import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(); // 행의 개수
    int m = scan.nextInt(); // 열의 개수
    int[][] arr = new int[n][m];
    Integer[] number = new Integer[n];

    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        arr[i][j] = scan.nextInt();
      }
    }

    int num = 10000; // 비교 기준값
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        if(arr[i][j] <= num){ // num보다 작으면
          num = arr[i][j]; // num값에 저장
        }
      }
      number[i] = num; // 해당 행에서 가장 작은 수 저장
      num = 100;
    }

    Arrays.sort(number, Collections.reverseOrder()); // 배열 내림차순 정렬
    System.out.print(number[0]); // 가장 큰 수 출력 
  }
}
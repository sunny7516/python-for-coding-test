import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(); // 행의 개수
    int m = scan.nextInt(); // 열의 개수

    int result = 0;
    
    for(int i=0; i<n; i++){
      int minNum = 10001; // 비교 기준값
      for(int j=0; j<m; j++){
        int x = scan.nextInt();
        minNum = Math.min(minNum, x); // 값 비교 작은 값 저장
      }
      result = Math.max(result, minNum); // 값 비교 큰 값 저장 
    }
    System.out.print(result); // 가장 큰 수 출력 
  }
}
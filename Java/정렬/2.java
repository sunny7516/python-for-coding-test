import java.util.*;

class Main {
  // 위에서 아래로 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    // 배열값 입력 
    Integer[] arr = new Integer[n];
    for(int i=0; i<n; i++){
      arr[i] = scan.nextInt();
    }

    // 기본 정렬 라이브러리 사용 
    Arrays.sort(arr, Collections.reverseOrder());

    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
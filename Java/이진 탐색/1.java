import java.util.*;

// 순차 탐색
class Main {

  // 순차 탐색 소스코드 구현
  public static int sequantialSearch(int n, String str, String[] arr){
    for(int i=0; i<n; i++){
      if(str.equals(arr[i])){ // 같은 문자열 찾으면 
        return i+1; // 인덱스 +1 출력(문자열 위치)
      }
    }
      return -1; // 찾지 못한 경우
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
    int n = scan.nextInt(); // 원소 개수
    String str = scan.next(); // 찾을 문자열

    String[] arr = new String[n];
    System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
    for(int i=0; i<n; i++){
      arr[i] = scan.next();
    }

    // 순차 탐색 결과
    System.out.println(sequantialSearch(n, str, arr));
   
  }
}
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();
    scan.nextLine();
    
    Integer[] a = new Integer[n];
    Integer[] b = new Integer[n];

    for(int i=0; i<n; i++){  
      a[i] = scan.nextInt();
    }
    // 오름차순
    Arrays.sort(a);

    for(int i=0; i<n; i++){
      b[i] = scan.nextInt();
    }
    // 내림차순 
    Arrays.sort(b, Collections.reverseOrder());

    // 최대 k번 비교 
    for(int i=0; i<k; i++){
      // a원소값이 b원소값보다 작으면
      if(a[i] < b[i]){
        // 값 교환
        int tmp = a[i];
        a[i] = b[i];
        b[i] = tmp;
      }else{
        // 크거나 같으면
        // 종료
        break;
      }
    }

    long result = 0;
    for(int i=0; i<n; i++){
      // a 결과값 합하기 
      result += a[i];
    }

    // 출력
    System.out.print(result);
  }
}


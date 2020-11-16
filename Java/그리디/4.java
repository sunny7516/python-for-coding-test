import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    int k = scan.nextInt();

    int cnt = n % k; // 1씩 더할 횟수
    n -= cnt; // 나눌 횟수

    while(true){
      if(n >= k){
        n /= k;
        cnt++;
      }else{
        break;
      }
    }
    
    System.out.print(cnt);
  }
}
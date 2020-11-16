import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(); // 손님에게 거슬러 줘야 할 돈
    int count = 0; // 동전의 최소 개수 
    int[] coin = {500, 100, 50, 10};  // 거스름돈으로 사용할 돈

    for(int i=0; i<4; i++){
        count += n / coin[i];  // 나눈 몫 : 사용한 동전 개수
        n %= coin[i]; // 나머지 : 남은 돈
      }

    System.out.print(count);
  }
}
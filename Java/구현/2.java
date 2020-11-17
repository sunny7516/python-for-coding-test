import java.util.*;

// 실전문제2 - 왕실의 나이트 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String str = scan.nextLine();
    int cnt = 0; // 경우의 수 : 결과값
    int[][] loc = {{2,-1},{2,1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}}; // 이동 배열 좌표

    for(int i=0; i<8; i++){
      int y = str.charAt(0) - 'a' + 1; // 문자 > int
      int x = str.charAt(1) - '0';

      // 좌표 이동
      x += loc[i][0]; 
      y += loc[i][1];

      // 이동 가능 범위에 있는지 확인
      if(x < 1 || x > 8 || y < 1 || y > 8){
        continue;
      }else{
        // 범위 안에 있으면 cnt 증가
        cnt++;
      }
    }

    System.out.print(cnt);
  }
}
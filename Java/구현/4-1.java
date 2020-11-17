import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int n = scan.nextInt(); // 공간의 크기
      scan.nextLine(); // 버퍼 비우기 
      int x = 1, y = 1;
      int[][] dirN = {{0,-1},{0,1},{-1,0},{1,0}}; // 이동 좌표
      char[] dir= {'L','R','U','D'}; // 이동 문자

      String str = scan.nextLine();

      for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);

        int nx = -1, ny = -1;
        for(int j=0; j<4; j++){
          if(ch == dir[j]){ // 입력받은 값과 같은 문자 인덱스 확인
            nx = x + dirN[j][0]; // 동일한 인덱스에 있는 x값 이동
            ny = y + dirN[j][1]; // 동일한 인덱스에 있는 y값 이동
          }

          // 정사각형 공간 벗어나면 건너뛰기 
          if(nx < 1 || nx > 5 || ny < 1 || ny > 5) continue;
          x = nx;
          y = ny;
        }
      }
      System.out.println(x + " " + y);
  }
}
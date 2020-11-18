import java.util.*;

public class Main {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y){

      // 범위를 넘어가면 종료
      if(x<=-1 || x>=n || y<=-1 || y>=m){
        return false;
      }

      // 방문처리 안돼있으면
      if(graph[x][y]==0){
        // 방문처리하고
        graph[x][y] = 1;

        // 상,하,좌,우 확인
        dfs(x-1, y);
        dfs(x+1, y);
        dfs(x, y-1);
        dfs(x, y+1);

        return true;
      }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 배열 크기 입력
        n = scan.nextInt();
        m = scan.nextInt();
        scan.nextLine(); // 버퍼 지우기 **

        // 배열값 입력
        for(int i=0; i<n; i++){
          String str = scan.nextLine();
          for(int j=0; j<m; j++){
            graph[i][j] = str.charAt(j) - '0';
          }
        }

        int result = 0;
        for(int i=0; i<n; i++){
          for(int j=0; j<m; j++){
            if(dfs(i,j)){
              result += 1;
            }
          }
        }

        // 결과값 출력 
        System.out.println(result);
    }
}

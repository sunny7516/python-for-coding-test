import java.util.*;

class Node{
  private int index;
  private int destination;

  public Node(int index, int destination){
    this.index = index;
    this.destination = destination;
  }

  public int getIndex(){
    return this.index;
  }

  public int getDestination(){
    return this.destination;
  }
}

class Main {
  public static int n, m;
  public static int[][] graph = new int[200][200];

  // 상, 하, 좌, 우 이동 좌표 
  public static int[] dx = {-1, 1, 0, 0};
  public static int[] dy = {0, 0, -1, 1};

  public static int bfs(int x, int y){
    // 큐 구현
    Queue<Node> q = new LinkedList<>();
    q.offer(new Node(x,y));

    // 큐가 빌 때까지 
    while(!q.isEmpty()){
      Node node = q.poll();
      x = node.getIndex();
      y = node.getDestination();

      // 상하좌우 확인
      for(int i=0; i<4; i++){
        int nx = x + dx[i];
        int ny = y + dy[i];

        // 범위 벗어나면 종료 
        if(nx<0 || nx>n || ny<0 || ny>m) continue;

        // 괴물이 있는 곳은 종료
        if(graph[nx][ny]==0) continue;

        // 갈 수 있는 부분이면
        if(graph[nx][ny] == 1){
          // 이동 칸 개수 증가
          graph[nx][ny] = graph[x][y] + 1;
          q.offer(new Node(nx, ny));
        }
      }
    }
    // 가장 마지막 칸 숫자 반환
    return graph[n-1][m-1];
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    n = scan.nextInt();
    m = scan.nextInt();
    scan.nextLine(); // 버퍼 지우기 ***

    // 배열값 입력
    for(int i=0; i<n; i++){
      String str = scan.nextLine();
      for(int j=0; j<m; j++){
        graph[i][j] = str.charAt(j) - '0';
      }
    }

    // 결과값 출력
    System.out.println(bfs(0,0));
  }
}
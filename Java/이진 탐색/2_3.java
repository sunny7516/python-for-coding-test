import java.util.*;

// 부품 찾기_set함수
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    HashSet<Integer> s = new HashSet<>();
    for(int i=0; i<n; i++){
      int x = scan.nextInt();
      s.add(x);
    }

    int m = scan.nextInt();
    int[] mrr = new int[m];
    for(int i=0; i<m; i++){
      mrr[i] = scan.nextInt();
    }

    for(int i=0; i<m; i++){
      if(s.contains(mrr[i])){
        System.out.print("yes ");
      }else{
        System.out.print("no ");
      }
    }
  }
}
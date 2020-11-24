import java.util.*;

class Main {
  // 부품 찾기_계수 정렬 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] nrr = new int[1000001];
    for(int i=0; i<n; i++){
      int x = scan.nextInt();
      nrr[x] = 1;
    }

    int m = scan.nextInt();
    int[] mrr = new int[m];
    for(int i=0; i<m; i++){
      mrr[i] = scan.nextInt();
    }

    for(int i=0; i<m; i++){
      if(nrr[mrr[i]] == 1){
        System.out.print("yes ");
      }else{
        System.out.print("no ");
      }
    }
  }
}
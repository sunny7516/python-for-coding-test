import java.util.*;

// 개미 전사
class Main {
  public static int[] d = new int[100];

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = scan.nextInt();
    }

    d[0] = arr[0];
    d[1] = Math.max(arr[0], arr[1]);

    for(int i=2; i<n; i++){
      d[i] = Math.max(d[i-1], d[i-2]+arr[i]);
    }

    System.out.println(d[n-1]);
  }
}
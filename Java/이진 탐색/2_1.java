import java.util.*;

class Main {
// 이진 탐색 소스코드 구현(반복문)
  public static int binarySearch(int[] arr, int target, int start, int end){
    while(start <= end){
      int mid = (start + end) / 2;
      if(arr[mid] == target) return mid;
      else if(arr[mid] > target) end = mid - 1;
      else start = mid + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] nrr = new int[n];
    for(int i=0; i<n; i++){
      nrr[i] = scan.nextInt();
    }

    Arrays.sort(nrr);

    int m = scan.nextInt();
    int[] mrr = new int[m];
    for(int i=0; i<m; i++){
      mrr[i] = scan.nextInt();
    }

    for(int i=0; i<m; i++){
      int result = binarySearch(nrr, mrr[i], 0, n-1);
      if(result != -1){
        System.out.print("yes ");
      }else{
        System.out.print("no ");
      }
    }
  }
}
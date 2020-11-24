import java.util.*;

// 이진탐색 (반복문)
class Main {

  public static int binarySearch(int start, int end, int target, int[] arr){

    while(start <= end){
      int check = (start + end) / 2;

      // 찾은 경우
      if(arr[check] == target) return check; 
      else if(arr[check] > target) end = check - 1;
      else start = check + 1;
    }
      return -1;
    }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int target = scan.nextInt();

    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = scan.nextInt();
    }

    int result = binarySearch(0, n-1, target, arr);
    if(result == -1){
      System.out.println("원소가 존재하지 않습니다.");
    }else{
      System.out.println(result + 1);
    }
  }
}
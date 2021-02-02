import java.util.*;

// 피보나치 수열 소스코드(반복적)
class Main {
  public static void main(String[] args) {
    long[] arr = new long[100];

    arr[1] = 1;
    arr[2] = 1;

    int n = 50;

    for(int i=3; i<n+1; i++){
      arr[i] = arr[i-1] + arr[i-2];
    }

    System.out.println(arr[n]);
  }
}
import java.util.*;

// 피보나치 수열 소스코드(재귀적)
class Main {
  public static long[] arr = new long[100];

  public static long fibo(int num){
    if(num == 1 || num == 2)  {
      return 1;
    }
    if(arr[num] != 0){
      return arr[num];
    }else{
      arr[num] = fibo(num-1) + fibo(num-2);
      return arr[num];
    }
  }

  public static void main(String[] args) {
    System.out.println(fibo(50));
  }
}
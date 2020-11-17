import java.util.*;

class Main {

  public static boolean checkTime(int i,int j,int k){
    if(i % 10 == 3 || j % 10 == 3 || j / 10 == 3 || k % 10 == 3 || k / 10 == 3){
      // 3을 포함하고 있으면 true
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int cnt = 0;

      for(int h=0; h<=num; h++){
        for(int m=0; m<60; m++){
          for(int s=0; s<60; s++){
            if(checkTime(h,m,s)){ // 조건에 만족하면
              cnt += 1; // cnt 세기 
            }
          }
        }
      }

      System.out.print(cnt);
  }
}
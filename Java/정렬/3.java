import java.util.*;
// 성적이 낮은 순서로 학생 출력하기

class Student implements Comparable<Student>{
  private String name;
  private int score;

  public Student(String name, int score){
    this.name = name;
    this.score = score;
  }

  public String getName(){
    return this.name;
  }

  public int getScore(){
    return this.score;
  }

  // 내림차순 정렬
  @Override
  public int compareTo(Student other){
    if(this.score < other.score){
      return -1;
    }
      return 1;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt(); // 학생 수
    ArrayList<Student> students = new ArrayList<>();

    // 이름, 점수 데이터 입력 
    for(int i=0; i<n; i++){
      String name = scan.next();
      int score = scan.nextInt();
      students.add(new Student(name, score));
    }

    // 정렬 
    Collections.sort(students);

    // 이름만 출력
    for(int i=0; i<students.size(); i++){
      System.out.print(students.get(i).getName() + " ");
    }
  }
}
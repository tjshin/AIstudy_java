package day04.test;

class Score{
  //이름, 국어점수, 영어점수, 수학점수, 총점, 평균
  private String n;
  public Score(String n, int k, int e, int m) {
    this.n = n;
    this.k = k;
    this.e = e;
    this.m = m;
  }
  
  public Score() {}
    
  public void setN(String n) {
    this.n = n;
  }
  public String getN() {
    return n;
  }
  
  private int k;
  public void setK(int k) {
    this.k = k;
  }
  public int getK() {
    return k;
  }
  
  private int e;
  public void setE(int e) {
    this.e = e;
  }
  public int getE() {
    return e;
  }  
  
  private int m;
  public void setM(int m) {
    this.m = m;
  }
  public int getM() {
    return m;
  }
  
  
  public double sum() {
    return (double)(k+e+m);
  }
  public double avg() {
    return (double)(sum()/3);
  }
  public void printScore() {
    System.out.println("이름: "+n);
    System.out.print("국어: "+k+"\t");
    System.out.print("영어: "+e+"\t");
    System.out.print("수학: "+m+"\n");
    System.out.println("총점: "+(int)sum());
    System.out.println("평균: "+String.format("%.1f",avg()));
  }
}

class Grade extends Score{  
  public Grade() {}
  public Grade(String n, int k, int e, int m) {
    super(n, k, e, m);
  }
  
  public String getGrade(double avg) {
        String grade;
    switch ((int)avg/10) {
    case 10: // score = 100
      grade = "A";
      break;
    case 9: // 90 <= score < 100
      grade = "A";
      break;
    case 8: // 80 <= score <= 89
      grade = "B";
      break;
    case 7: // 70 <= score <= 79
      grade = "C";
      break;
    case 6: // 60 <= score <= 69
      grade = "D";
      break;
    default: // score <= 59
      grade = "F";
    }
    return grade;
    //System.out.println("학점은 " + grade + "입니다");
  }
  
  //overriding printScore()
  @Override
  public void printScore() {
    super.printScore();
    System.out.println("학점: " + getGrade(avg()) + "\n");
  }
  

  
  
}

public class ScoreCalc {

  public static void main(String[] args) {
    // Score 객제 3개 생성
//    Score s1 = new Score();
//    Score s2 = new Score();
//    Score s3 = new Score();
//    Score s4 = new Score("배정대",75,32,63);
    //각 개체의 이름, 점수들 할당, 총점/평균 계산하기
//    s1.setN("강백호");
//    s1.setK(83);
//    s1.setE(70);
//    s1.setM(55);
//    
//    s2.setN("황재균");
//    s2.setK(95);
//    s2.setE(91);
//    s2.setM(77);
//    
//    s3.setN("로하스");
//    s3.setK(15);
//    s3.setE(100);
//    s3.setM(81);
    //이름, 점수들, 총점, 평균 출력
    
//    s1.printScore();
//    s2.printScore();
//    s3.printScore();
//    s4.printScore();
    
    //grade 객체 기본생성자로, 매개변수 있는 생성자로 생성 후 출력하기
    Grade g1 = new Grade();
    g1.setN("조용호");
    g1.setK(71);
    g1.setE(45);
    g1.setM(80);
    Grade g2 = new Grade("심우준", 88, 60, 99);
    g1.printScore();
    g2.printScore();

  }

}

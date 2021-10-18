package day03.test;

class Score{
  //이름, 국어점수, 영어점수, 수학점수, 총점, 평균
  String n;
  int k;
  int e;
  int m;
  double sum;
  double avg;
}

public class ScoreCalc {

  public static void main(String[] args) {
    // Score 객제 3개 생성
    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();
    //각 개체의 이름, 점수들 할당, 총점/평균 계산하기
    s1.n = "강백호";
    s1.k = 91;
    s1.e = 80;
    s1.m = 55;
    s1.sum = (s1.k+s1.e+s1.m);
    s1.avg = s1.sum/3;
    
    s2.n = "황재균";
    s2.k = 87;
    s2.e = 91;
    s2.m = 77;
    s2.sum = (s2.k+s2.e+s2.m);
    s2.avg = s2.sum/3;
    
    s3.n = "로하스";
    s3.k = 15;
    s3.e = 100;
    s3.m = 81;
    s3.sum = (s3.k+s3.e+s3.m);
    s3.avg = s3.sum/3;
    //이름, 점수들, 총점, 평균 출력
    
    System.out.println("이름: "+s1.n);
    System.out.print("국어: "+s1.k+"\t");
    System.out.print("영어: "+s1.e+"\t");
    System.out.print("수학: "+s1.m+"\n");
    System.out.println("총점: "+(int)s1.sum);
    System.out.println("평균: "+String.format("%.1f",s1.avg)+"\n");
    
    System.out.println("이름: "+s2.n);
    System.out.print("국어: "+s2.k+"\t");
    System.out.print("영어: "+s2.e+"\t");
    System.out.print("수학: "+s2.m+"\n");
    System.out.println("총점: "+(int)s2.sum);
    System.out.println("평균: "+String.format("%.1f",s2.avg)+"\n");
    
    System.out.println("이름: "+s3.n);
    System.out.print("국어: "+s3.k+"\t");
    System.out.print("영어: "+s3.e+"\t");
    System.out.print("수학: "+s3.m+"\n");
    System.out.println("총점: "+(int)s3.sum);
    System.out.println("평균: "+String.format("%.1f",s3.avg)+"\n");
    

  }

}

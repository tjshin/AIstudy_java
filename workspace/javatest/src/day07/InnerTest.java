package day07;

class OutClass{
  private int num = 10;
  private static int sNum = 20;
  private InClass inclass;
  
  public OutClass() {
    inclass  = new InClass();
  }
  
  class InClass{
    int inNum = 100;
    
    void inTest() {
      System.out.println("OutClass num = " + num + "(외부클래스의 인스턴스 변수)");
      System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
    }
  }
  
  public void usingClass() {
    inclass.inTest();
  }
}

public class InnerTest {

  public static void main(String[] args) {
    OutClass outclass = new OutClass();
    System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
    outclass.usingClass();
    System.out.println();

  }

}

package day07;

interface ISungjuk {
  public void setJumsu(int kuk, int eng);
  public abstract void print();
}

class Sungjuk implements ISungjuk{
  int kuk = 0;
  int eng = 0;
  @Override
  public void setJumsu(int kuk, int eng) {
    this.kuk = kuk;
    this.eng = eng;    
  }
  
  @Override
  public void print() {
    System.out.println("성적 증명서");
    System.out.println("국어: " + this.kuk);
    System.out.println("영어: " + this.eng);
    }  
}



public class SungjukTest {

  public static void main(String[] args) {
    ISungjuk is = new Sungjuk();
    is.setJumsu(90, 85);
    is.print();

  }

}

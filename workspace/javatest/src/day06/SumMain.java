package day06;

abstract class Sum{
  public abstract String toString();//추상 메소드
  
  public String sum(int i, int k) {//일반 메소드
    int sum = i+k;
    return " " + sum;
  }
}

class Sum_s1 extends Sum{

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "class Sum_s1 extends Sum";
  }
  
}

class Sum_s2 extends Sum{

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "class Sum_s2 extends Sum";
  }
  
}

public class SumMain {

  public static void main(String[] args) {
    Sum_s1 s1 = new Sum_s1();
    System.out.println(s1.sum(10,20));
    System.out.println(s1.toString());
    
    Sum_s2 s2 = new Sum_s2();
    System.out.println(s2.sum(100,200));
    System.out.println(s2.toString());

  }

}

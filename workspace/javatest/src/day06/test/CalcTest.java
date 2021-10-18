package day06.test;

//추상 클래스 Calculator를 상속받는 GoodCalc 클래스를 작성하세요.

abstract class Calculator{
  public abstract int add(int a, int b);
  public abstract int substract(int a, int b);
  public abstract double average(int[] a);
}

class GoodCalc extends Calculator{

  @Override
  public int add(int a, int b) {
    return a+b;
  }

  @Override
  public int substract(int a, int b) {
    return a-b;
  }

  @Override
  public double average(int[] a) {
    double sum = 0;
    int i = 0;
    for (i=0;i < a.length;i++) {
      sum += a[i];      
    }
    return sum/a.length;
  }
    
}

public class CalcTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    GoodCalc g = new GoodCalc();
    int [] aa = {3, 5, 2, 7, 2400};
    
    System.out.println(g.add(23, 1));
    System.out.println(g.substract(99, 180));
    System.out.println(g.average(aa));
    

  }

}

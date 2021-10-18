package day05;

class A {
  public  int p;
  private int n;
  public void setN(int n) {
this.n = n;
  }
  public int getN() {
return n;
  }
}


class B extends  A {
  private int m;
  public void setM(int m) {
this.m = m;
  }
  public int getM() {
return m;
  }
  public String toString() {
       String s = getN() + " " + getM();
       return s;
  }
}


public class Main{
 
   public static void main(String [] args) {
       A a = new A();
       a.setN(100);
       System.out.println(a);
       B b = new B();
       b.setN(100);
       b.setM(300);
       System.out.println(b);
   }
}
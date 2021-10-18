package day05.test;
//원, 삼각형, 직사각형 3개 + 도형사용 클래스 1개 = 총 4개
//삼각형은 헤론의 공식으로 넓이 구하기

import java.text.DecimalFormat;

class Circle {
  //생성자
  public Circle() {}
  public Circle(int r) {
    this.r = r;
  }
  //멤버변수(반지름, 세 변 길이, 가로 세로 길이)
  private int r;//반지름
  public void setR(int r) {
    this.r = r;
  }
  public int getR() {
    return r;
  }  
  //넓이, 둘레 구하는 메소드, 출력 메소드 선언
  public double prm() {
    return 2 * Math.PI * r; 
  }
  public double area() {
    return Math.PI * r * r;
  }
  public void printC() {
    DecimalFormat f = new DecimalFormat("#####.##");
    System.out.println("====원의 둘레, 넓이=======");
    System.out.println("원의 반지름: " + r);
    System.out.println("원의 둘레: " + f.format(prm()));
    System.out.println("원의 넓이: " + f.format(area())+"\n");
  }
  
}

class Semo {
  //생성자
  public Semo() {}
  public Semo(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  //멤버변수(반지름, 세 변 길이, 가로 세로 길이)
  private int a;
  public void setA(int a) {
    this.a = a;
  }
  public int getA() {
    return a;
  }
  private int b;
  public void setB(int b) {
    this.b = b;
  }
  public int getB() {
    return b;
  }
  private int c;
  public void setC(int c) {
    this.c = c;
  }
  public int getC() {
    return c;
  }
  //넓이, 둘레 구하는 메소드, 출력 메소드 선언
  public double prm() {
    return a+b+c; 
  }
  public double area() {
    double s = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
  public void printS() {
    DecimalFormat f = new DecimalFormat("#####.##");
    System.out.println("====삼각형의 둘레, 넓이====");
    System.out.println("삼각형의 세 변 길이: " + a +", " + b + ", " + c);
    System.out.println("삼각형의 둘레: " + f.format(prm()));
    System.out.println("삼각형의 넓이: " + f.format(area())+"\n");
  }
  
}

class Nemo {
  //생성자
  public Nemo() {}
  public Nemo(int x, int y) {
    this.x = x;
    this.y = y;
  }
  //멤버변수(반지름, 세 변 길이, 가로 세로 길이)
  private int x;
  public void setX(int x) {
    this.x = x;
  }
  public int getX() {
    return x;
  }
  private int y;
  public void setY(int y) {
    this.y = y;
  }
  public int getY() {
    return y;
  }
  //넓이, 둘레 구하는 메소드, 출력 메소드 선언
  public double prm() {
    return x+x+y+y; 
  }
  public double area() {
    return x*y;
  }
  public void printN() {
    DecimalFormat f = new DecimalFormat("#####.##");
    System.out.println("====사각형의 둘레, 넓이====");
    System.out.println("사각형의 가로 세로: " + x +", " + y);
    System.out.println("사각형의 둘레: " + f.format(prm()));
    System.out.println("사각형의 넓이: " + f.format(area())+"\n");
  }
  
}




public class Figure {
  
  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.setR(10);
    c1.printC();
    Circle c2 = new Circle(15);
    c2.printC();
    
    Semo t1 = new Semo();
    t1.setA(3);
    t1.setB(4);
    t1.setC(5);
    t1.printS();
    Semo t2 = new Semo(7,8,13);
    t2.printS();
    
    Nemo r1 = new Nemo();
    r1.setX(2);
    r1.setY(23);
    r1.printN();
    Nemo r2 = new Nemo(23,96);
    r2.printN();
    
  }

}

package day04.test;

import java.util.Scanner;

//산술연산(+, -, *, /, %)를 계산 하는 클래스(1)와
//클래스(1)을 사용하는 main()있는 클래스(2)를 만듭니다.
//
//클래스(1)에는 
//멤버변수 캡슐화된 두수,연산자 번호
//입력메소드() - Scanner를 이용해서  연산자번호(1,2,3,4,5) 와 멤버변수값 할당
//계산메소드() - 산술연산처리하는 메소드 (제어문 사용)
//출력메소드() - 멤버변수 및 연산자, 연산후 결과값 출력 메소드
//
//클래스(2)에는 
//main()있고, 클래스(1)를 객체 생성후  세개의 메소드 호출 한다.

class Calc{
  
  //멤버변수  수1, 수2, 연산자
  private int x;
  public void setX(int x) {
    this.x = x;
  }
  public int getX() {
    return x;
  }//숫자1 입력
  
  private int y;
  public void setY(int y) {
    this.y = y;
  }
  public int getY() {
    return y;
  }//숫자 2 입력
  
  private int z;
  public void setZ(int z) {
    this.z = z;
  }
  public int getZ() {
    return z;
  }//연산자 번호
  
  public Calc() {}
  public Calc(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
    }
  
  public void input() {
    Scanner in = new Scanner(System.in);
    
    System.out.println("숫자1, 숫자2, 연산번호 입력: "+"\n"+"(+:1 -:2 *:3 /:4 %:5)");
    this.x = in.nextInt();
    this.y = in.nextInt();
    this.z = in.nextInt();
  }
  
  public int cc() {
    int r = 0;
    if(z == 1) {
      r = x+y;
    }
    else if(z == 2) {
      r = x-y;
    }
    else if(z == 3) {
      r = x*y;
    }
    else if(z == 4) {
      r = x/y;
    }
    else if(z == 5) {
      r = x%y;
    }
    else {
      System.out.println("연산 번호는 1부터 5까지의 숫자 입력");
    }
    return r;
  }
  public void out() {
    String zz = " ";
    switch (z) {
    case 1: zz="+"; break;
    case 2: zz="-"; break;
    case 3: zz="*"; break;
    case 4: zz="/"; break;
    case 5: zz="%"; break;
    }
    System.out.println(x+zz+y+"="+ cc());
  
  }
} 


public class CalcCalc {

  public static void main(String[] args) {
    Calc n = new Calc();
    n.input();
    n.cc();
    n.out();
  }

}

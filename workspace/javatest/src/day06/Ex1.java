package day06;

public class Ex1 {

  public static void main(String[] args) {
    int a = 10;  
    int b = 0;
    
    try {

    System.out.println(" a = " + a + " b = " + b ); 
    System.out.println(" a/b = " + (a/b) ); 
    System.out.println("나눗셈이 수행되었습니다.");
    }catch(Exception e) {
      e.printStackTrace();
    }finally {
      System.out.println("나눗셈 연산이 종료됩니다.");
    }
    
    System.out.println("프로그램이 정상적으로 종료됩니다.");

  }

}

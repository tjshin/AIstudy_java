package day02.test;

public class Ex05 {

  public static void main(String[] args) {
    char c = 'B'; 
    
    if(c < 'A' || c > 'D') {
      System.out.println("코드는 A부터 D까지 입력해야 합니다.");
    }else {
      System.out.println("입력된 코드는 "  +c+  " 입니다."); 
    }
  }

}

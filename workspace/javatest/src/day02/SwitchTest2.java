package day02;

public class SwitchTest2 {

  public static void main(String[] args) {
    char c = 'C';
    String str = "Cdef";
    
    switch(str.charAt(3)) {    
    case'A':
      System.out.println("입력된 코드는 Apple");
      break;
    case'B':
      System.out.println("입력된 코드는 BitCoin");
      break;
    case'C':
      System.out.println("입력된 코드는 Carrot");
      break;
    case'D':
      System.out.println("입력된 코드는 DonSin");
      break;
      default:
        System.out.println("A와 D까지밖에 모르는 바보");
        break;
    }

  }

}
